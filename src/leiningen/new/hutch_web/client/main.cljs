(ns {{name}}.client.main
  (:require [fetch.remotes :as remotes])
  (:require-macros [fetch.macros :as fm]))

;;(fm/remote (adder 2 5 6) [result]
;;  (js/alert result))
;;
;;(fm/remote (get-user 2) [{:keys [username age]}]
;;  (js/alert (str "Name: " username ", Age: " age)))
;;
;;;; for a much nicer experience, use letrem
;;(fm/letrem [a (adder 3 4)
;;            b (adder 5 6)]
;;    (js/alert (str "a: " a " b: " b)))
