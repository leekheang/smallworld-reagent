(ns smallworld.components.home)

(defn home
  []
    [:div {:class "keyopp"}
     [:div {:class "colorour"}
      [:div {:class "ui grid"}
        [:div {:class "two wide column"}]
        [:div {:class "two wide column"}]
        [:div {:class "four wide column"}
          [:div {:class "keyopp1"}
            [:h2 "Our Advantages"]
            [:p "Estonia consistently ranks as a world leader in human
                capital, digital capability. and ease of doing business.
                The creates a competitive environment which allows
                solutions and services to be researched, developed
                and delivered globally"]
            [:p "from multinational companies to high growth startup
                Estonia has a two-decade track record of successful
                investments and innovations"]]]
        [:div {:class "one wide column"}]
        [:div {:class "four wide column"}
          [:div {:class "keyopp1"}
            [:ul {:class "our-list"}
              [:li [:p "Smart People"]]
              [:li [:p "Pro-Business Environment"]]
              [:li [:p "Digitally Enabled Nation"]]
              [:li [:p "Scalable Localtion"]]
              [:li [:p "solid Investment Track Record"]]]]]
        [:div {:class "one wide column"}]
        [:div {:class "two wide column"}
          [:div {:class "keyopp1"}]]
        [:div {:class "four wide column"}]]]
        [:div {:class "ui grid"}
          [:div {:class "two wide column"}]
          [:div {:class "one wide column"}]
          [:div {:class "two wide column"}
            [:div {:class "keyopp1"}
              [:ul {:class "key-list"}
                [:li [:p "Software Developement"]]
                [:li [:p "Mechanical Engineering"]]
                [:li [:p "Digital Logistics"]]
                [:li [:p "Hight-tech System"]]]]]
          ; [:div {:class "one wide column"}]
          [:div {:class "two wide column"}
            [:div {:class "keyopp1"}
              [:ul {:class "key-list"}
                [:li [:p "Software Developement"]]
                [:li [:p "Mechanical Engineering"]]
                [:li [:p "Digital Logistics"]]
                [:li [:p "Hight-tech System"]]]]]
          [:div {:class "four wide column key"}
            [:div {:class "keyopp1"}
              [:h2 "Key Opportunities"]
              [:p "Estonia consistently ranks as a world leader in human
                  capital, digital capability. and ease of doing business.
                  The creates a competitive environment which allows
                  solutions and services to be researched, developed
                  and delivered globally"]
              [:p "from multinational companies to high growth startup
                  Estonia has a two-decade track record of successful
                  investments and innovations"]]]
          [:div {:class "four wide column"}]]])
