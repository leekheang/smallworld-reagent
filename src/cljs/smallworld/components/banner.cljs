(ns smallworld.components.banner)

(defn banner
  []
  [:div {:className "bannerPage"}
    [:div {:className "bannerBackground"}
      [:div {:className "bannerText"}
         [:h1 {:class "bannerTitle"} "Southeast Asia's Hub" [:br] "for Knowledge and "[:br]"Digital Business"]
         [:p {:className "bannerDec"} "World-class human capital, unique digital capabilities and a competitive"
         [:br] "business environment make Cambodia a smart, agile location"
         [:br] "for business with global ambitions."]
         [:button {:class "ui inverted basic button"} "LEARN MORE"]]]])
