(ns smallworld.components.moreinfo)

(defn moreinfo
  []
  [:div {:class "moreinfo"}
    [:div {:class "ui grid"}
      [:div {:class "four wide column"}]
      [:div {:class "four wide column"}
        [:div {:class "moreinfor1"}]
        [:h2 "Need More Information?"]
        [:p " What is it like to run a businss in Cambodia?"
        [:br] "How to benefit from the e-solutuions and the"
        [:br] "efficiency of business colture?"]
        [:p "What are the opportunities in specific sectors?"]]
      [:div {:class "five wide column"}
        [:div {:class "moreinfor2"}
          [:p "The business in Estonia section helps you prepare for"
          [:br] "doing businss in Estonia. And if you have any further"
          [:br] "questions, our businss advises are happy to help."]
          [:button {:class "ui inverted basic button"} "BUSINESS IN CAMBODIA"][:button {:class "ui inverted basic button"} "CONTACT US"]]]
      [:div {:class "four wide column"}]]])
