(ns smallworld.components.navbar
  (:require [reagent.core :as reagent :refer [atom]]))

;;navbar
(def opportunities (atom {:menu false}))
(def businessincambodia (atom {:menu false}))
(def newandevents (atom {:menu false}))
(def contactus (atom {:menu false}))

(defn navbar
  []
  [:div {:className "ui secondary menu"}
    [:div {:className "ui fluid container"}
    [:center
     [:a {:href "/"}
     [:img {:src "http://smallworldcambodia.com/static/smallworld/img/logo.png", :class "mobile hidden logo", :height ""}]]]
    [:div {:class "menu right"}
     [:a {:class "item", :href "/opportunities"} "Opportunities"]
     [:a {:class "item", :href "/businessincambodia"} "Business in Cambodia"]
     [:a {:class "item", :href "/newsandevents"} "New & Events"]
     [:a {:class "item", :href "/contactus"} "Contact Us"]]]])
