(ns smallworld.handler
  (:require [reitit.ring :as reitit-ring]
            [smallworld.middleware :refer [middleware]]
            [hiccup.page :refer [include-js include-css html5]]
            [config.core :refer [env]]))

(def mount-target
  [:div#app
   [:h2 "Welcome to smallworld"]
   [:p "please wait while Figwheel is waking up ..."]
   [:p "(Check the js console for hints if nothing exсiting happens.)"]])

(defn head []
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1"}]
   (include-css (if (env :dev) "/css/site.css" "/css/screen.css"))
   (include-css (if (env :dev) "https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.css"));cdn
   (include-css (if (env :dev) "https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.9/semantic.min.js"))])

(defn loading-page []
  (html5
   (head)
   [:body {:class "body-container"}
    mount-target
    (include-js "/js/app.js")]))

(defn index-handler
  [_request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (loading-page)})

(def app
  (reitit-ring/ring-handler
   (reitit-ring/router
    [["/" {:get {:handler index-handler}}]
      ["/opportunities" {:get {:handler index-handler}}]
      ["/businessincambodia" {:get {:handler index-handler}}]
      ["/newsandevents" {:get {:handler index-handler}}]
      ["/contact-us" {:get {:handler index-handler}}]
      ["/about" {:get {:handler index-handler}}]]
    {:data {:middleware middleware}})
   (reitit-ring/routes
    (reitit-ring/create-resource-handler {:path "/" :root "/public"})
    (reitit-ring/create-default-handler))))
