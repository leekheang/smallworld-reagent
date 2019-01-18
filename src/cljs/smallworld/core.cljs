(ns smallworld.core
    (:require [reagent.core :as reagent :refer [atom]]
              [reagent.session :as session]
              [reitit.frontend :as reitit]
              [clerk.core :as clerk]
              [accountant.core :as accountant]
              ;mycomponents
              [smallworld.components.navbar :refer [navbar]]
              [smallworld.components.banner :refer [banner]]
              [smallworld.components.bannerevents :refer [bannerevents]]
              [smallworld.components.home :refer [home]]
              [smallworld.components.homeeventandnews :refer [homeeventandnews]]
              [smallworld.components.bannervideo :refer [bannervideo]]
              [smallworld.components.opportunities :refer [opportunities]]
              [smallworld.components.businessincambodia :refer [businessincambodia]]
              [smallworld.components.newsandevents :refer [newsandevents]]
              [smallworld.components.moreinfo :refer [moreinfo]]
              [smallworld.components.footer :refer [footer]]))

;; -------------------------
;; Routes

(def router
  (reitit/router
   [["/" :index]
    ["/opportunities" :opportunities]
    ["/businessincambodia" :businessincambodia]
    ["/newsandevents" :newsandevents]
    ["/about" :about]]))

(defn path-for [route & [params]]
  (if params
    (:path (reitit/match-by-name router route params))
    (:path (reitit/match-by-name router route))))

(path-for :about)
;; -------------------------
;; Page components

(defn home-page []
  (fn []
    [:div
      [banner]
      [home]
      [homeeventandnews]
      [bannervideo]
      [moreinfo]]))

(defn opportunities-page []
  (fn []
    [:div
      [banner]
      [opportunities]
      [homeeventandnews]
      [moreinfo]]))

(defn businessincambodia-page []
  (fn []
    [:div
      [banner]
      [businessincambodia]
      [homeeventandnews]
      [moreinfo]]))

(defn newsandevents-page []
  (fn []
    [:div
      [bannerevents]
      [newsandevents]
      [moreinfo]]))

(defn about-page []
  (fn [] [:span.main
          [:h1 "About smallworld"]]))


;; -------------------------
;; Translate routes -> page components

(defn page-for [route]
  (case route
    :index #'home-page
    :opportunities #'opportunities-page
    :businessincambodia #'businessincambodia-page
    :newsandevents #'newsandevents-page
    :about #'about-page))


;; -------------------------
;; Page mounting component

(defn current-page []
  (fn []
    (let [page (:current-page (session/get :route))]
      [:div
       [navbar]
       [page]
       [footer]])))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (clerk/initialize!)
  (accountant/configure-navigation!
   {:nav-handler
    (fn [path]
      (let [match (reitit/match-by-path router path)
            current-page (:name (:data  match))
            route-params (:path-params match)]
        (reagent/after-render clerk/after-render!)
        (session/put! :route {:current-page (page-for current-page)
                              :route-params route-params})
        (clerk/navigate-page! path)
        ))
    :path-exists?
    (fn [path]
      (boolean (reitit/match-by-path router path)))})
  (accountant/dispatch-current!)
  (mount-root))
