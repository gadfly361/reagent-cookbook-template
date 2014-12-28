(ns {{ns-name}}.core
    (:require [reagent.core :as reagent]))

(defn home []
  [:div [:h1 "Welcome to Reagent Cookbook!"]
   
   ])

(reagent/render-component [home]
                          (.getElementById js/document "app"))
