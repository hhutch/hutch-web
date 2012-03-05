(ns {{name}}.server
  (:require [noir.server :as server]
            [clj-yaml.core :as yaml])
  (:use [noir.fetch.remotes]))

(server/load-views "src/little_conjuror/views/")

;; Example use of fetch
;(defremote adder [& nums]
;  (apply + nums))
;(defremote get-user [id]
;  {:username "Chris"
;   :age 24})

(server/add-middleware wrap-remotes)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns '{{name}}})))

