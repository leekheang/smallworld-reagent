(ns smallworld.components.bannervideo)

(defn bannervideo
  []
  [:div
    [:iframe {:width "1980", :height "450",
    :src "",
    :frameborder "0",
    :allow "accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture",
    :allowfullscreen "true" }]])
