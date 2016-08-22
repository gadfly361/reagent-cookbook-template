(ns {{ns-name}}.core
  (:require [reagent.core :as reagent]))


(defonce app-state
  (reagent/atom {}))


(defn page [ratom]
  [:div
   [:h1 "Reagent Cookbook Template"]
   ])


(defn reload []
  (reagent/render [page app-state]
                  (.getElementById js/document "app")))

(defn ^:export main []
  (reload))
