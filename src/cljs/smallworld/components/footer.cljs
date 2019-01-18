(ns smallworld.components.footer)

(defn footer
  []
  [:footer {:class "ft-container"}
    [:div {:class "ui grid row"}
      [:div {:class "three wide column"}]
      [:div {:class "three wide column paddingme"}
        [:ul {:class "list-unstyled"}
          [:li [:a {:href "#", :title "Opportunities"} "Opportunities"]]
          [:li [:a {:href "#" :title "Business in Cambodia"} "Business in Cambodia"]]
          [:li [:a {:href "#" :title "New & Events"} "New & Events"]]
          [:li [:a {:href "#", :title "Contact Us"} "Contact Us"]]]]
    [:div {:class "three wide column"}
      [:ul {:class "list-unstyled"}
        [:li [:a {:href "#", :title "Term and Condition"} "Term and Condition"]]
        [:li [:a {:href "#" :title "Policy Uses"} "Policy User"]]
        [:li [:a {:href "#" :title "Legal System"} "Legal System"]]]]
      [:div {:class "two wide column"}]
    [:div {:class "three wide column"}
      [:ul {:class "list-unstyled"}
        [:li [:a {:href "#", :title "Facebook"}[:i {:class "icon facebook"}] "Facebook"]]
        [:li [:a {:href "#" :title "Telegram"}[:i {:class "icon telegram"}] "Telegram"]]
        [:li [:a {:href "#" :title "Tweeter"}[:i {:class "icon twitter square"}] "Twitter"]]]
      [:div {:class "ft-img"}
        [:a {:href "/"}
        [:img {:src "http://smallworldcambodia.com/static/smallworld/img/logo.png", :class "mobile hidden logo", :height ""}]]]]
    [:div {:class "two wide column"}]]])
