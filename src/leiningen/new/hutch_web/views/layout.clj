(ns {{name}}.views.layout
  (:require [net.cgrand.enlive-html :as dom])
  (:use noir.core
        [hiccup.core :only [html]]
        [hiccup.page-helpers :only [html5
                                    include-js
                                    include-css]]
        clojure.pprint))

(dom/deftemplate layout
  "{{sanitized}}/views/layout.html"
  [body]
  [:head] (dom/append (dom/html-snippet (html (include-css "/css/reset.css")))) 
  [:div#main] (dom/content body)
  [:#footer] (dom/append (dom/html-snippet (html (include-js "/cljs/bootstrap.js")))))
