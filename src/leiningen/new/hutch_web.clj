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
             ["resources/public/css/reset.css" (render "resources/public/css/reset.css" data)]
             ["resources/public/css/style.css" (render "resources/public/css/style.css" data)]
             ["resources/public/js/libs/modernizr-2.5.3.min.js" (render "resources/public/js/libs/modernizr_2.5.3.min.js" data)]
             ["resources/public/js/libs/jquery-1.7.1.min.js" (render "resources/public/js/libs/jquery_1.7.1.min.js" data)]
             ["resources/public/apple-touch-icon-114x114-precomposed.png" (render "boiler_plate_images/apple_touch_icon_114x114_precomposed.png" data)]
             ["resources/public/apple-touch-icon-57x57-precomposed.png" (render "boiler_plate_images/apple_touch_icon_57x57_precomposed.png" data)]
             ["resources/public/apple-touch-icon-72x72-precomposed.png" (render "boiler_plate_images/apple_touch_icon_72x72_precomposed.png" data)]
             ["resources/public/apple-touch-icon-precomposed.png" (render "boiler_plate_images/apple_touch_icon_precomposed.png" data)]
             ["resources/public/apple-touch-icon.png" (render "boiler_plate_images/apple_touch_icon.png" data)]
             ["resources/public/favicon.ico" (render "boiler_plate_images/favicon.ico" data)]
             ["src/client/main.cljs" (render "client/main.cljs" data)]
             ["src/{{sanitized}}/views/layout.html" (render "views/layout.html" data)]
             ["src/{{sanitized}}/views/layout.clj" (render "views/layout.clj" data)]
             ["src/{{sanitized}}/views/welcome.clj" (render "views/welcome.clj" data)]
             ["src/{{sanitized}}/server.clj" (render "server.clj" data)]
             [".gitignore" (render "gitignore" data)])))
