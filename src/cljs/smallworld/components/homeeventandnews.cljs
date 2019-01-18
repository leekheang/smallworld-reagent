(ns smallworld.components.homeeventandnews)

(defn homeeventandnews
  []
  [:div {:class "hmeventandnews"}
    [:center {:class ""} [:h2 "Events & News"]]
    [:div {:class "homeeventandnewsPadding"}
    [:div {:class "ui grid"}
      [:div {:class "three wide column"}]
      [:div {:class "two wide column item "}
        [:img {:src "https://www.lmax.com/wp-content/uploads/sites/2/2018/04/events3-2.jpg"}]
        [:a {:href "#", :title "December"} "December 4, 2018 -Art of Investment @Slush"]
        [:p "Event"]]
      [:div {:class "two wide column item1"}
        [:img {:src "https://www.lmax.com/wp-content/uploads/sites/2/2018/04/events3-2.jpg"}]
        [:a {:href "#", :title "December"} "December 4, 2018 -Art of Investment @Slush"]
        [:p "News"]]
      [:div {:class "two wide column item2"}
        [:img {:src "https://www.lmax.com/wp-content/uploads/sites/2/2018/04/events3-2.jpg"}]
        [:a {:href "#", :title "December"} "December 4, 2018 -Art of Investment @Slush"]
        [:p "News"]]
      [:div {:class "two wide column item3"}
        [:img {:src "https://www.lmax.com/wp-content/uploads/sites/2/2018/04/events3-2.jpg"}]
        [:a {:href "#", :title "December"} "December 4, 2018 -Art of Investment @Slush"]
        [:p "News"]]
      [:div {:class "one wide column"}]]] ])
