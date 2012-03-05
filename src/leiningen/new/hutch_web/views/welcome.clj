(ns {{name}}.views.welcome
  (:require [net.cgrand.enlive-html :as dom])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]
        [hiccup.page-helpers :only [html5
                                    include-js
                                    include-css]]
        [{{name}}.views.layout :only [layout]]))

(defpage "/" []
  (layout "Welcome to {{name}}"))
