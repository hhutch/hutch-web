(ns leiningen.new.hutch-web
    (:use leiningen.new.templates))

(def render (renderer "hutch_web"))

(defn hutch-web
  "Build a standard web project"
  [name]
  (let [data {:name name
              :project-version "0.0.1-SNAPSHOT"
              :sanitized (sanitize name)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["resources/public/css/reset.css" "resources/public/css/reset.css"]
             ["resources/public/css/style.css" "resources/public/css/style.css"]
             ["resources/public/js/libs/modernizr-2.5.3.min.js" 
              "resources/public/js/libs/modernizr-2.5.3.min.js"]
             ["resources/public/js/libs/jquery-1.7.1.min.js" 
              "resources/public/js/libs/jquery-1.7.1.min.js"]
             ["resources/public/apple-touch-icon-114x114-precomposed.png" 
              "boiler_plate_images/apple-touch-icon-114x114-precomposed.png"]
             ["resources/public/apple-touch-icon-57x57-precomposed.png"
              "boiler_plate_images/apple-touch-icon-57x57-precomposed.png"]
             ["resources/public/apple-touch-icon-72x72-precomposed.png"
              "boiler_plate_images/apple-touch-icon-72x72-precomposed.png"]
             ["resources/public/apple-touch-icon-precomposed.png"
              "boiler_plate_images/apple-touch-icon-precomposed.png"]
             ["resources/public/apple-touch-icon.png"
              "boiler_plate_images/apple-touch-icon.png"]
             ["resources/public/favicon.ico" "boiler_plate_images/favicon.ico"]
             ["src/client/main.cljs" (render "client/main.cljs" data)]
             ["src/{{sanitized}}/views/layout.html" (render "views/layout.html" data)]
             ["src/{{sanitized}}/views/layout.clj" (render "views/layout.clj" data)]
             ["src/{{sanitized}}/views/welcome.clj" (render "views/welcome.clj" data)]
             ["src/{{sanitized}}/server.clj" (render "server.clj" data)]
             [".gitignore" "gitignore"])))
