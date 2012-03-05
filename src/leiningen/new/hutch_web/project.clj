(defproject {{name}} "{{project-version}}"
            :description "FIXME: noir starter project for {{name}}"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [fetch "0.1.0-SNAPSHOT"]
                           [enfocus "0.9.1-SNAPSHOT"]
                           [enlive "1.0.0"]
                           [jayq "0.1.0-SNAPSHOT"]
                           [clj-yaml "0.3.0-SNAPSHOT"]
                           [clj-time "0.3.7"]
                           [noir "1.2.1"]]
            :cljsbuild {:source-path "src"
                        :compiler
                        {:output-dir "resources/public/cljs/"
                         :output-to "resources/public/cljs/bootstrap.js"
                         :optimizations :simple
                         :pretty-print true} }
            :plugins [[lein-cljsbuild "0.1.2"]
                      [lein-marginalia "0.7.0-SNAPSHOT"]]
            :main {{name}}.server)

