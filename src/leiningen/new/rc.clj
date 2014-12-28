(ns leiningen.new.rc
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "rc"))

(defn rc
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/cljs/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/clj/{{sanitized}}/handler.clj" (render "handler.clj" data)]
             ["resources/public/index.html" (render "index.html")]
             )))
