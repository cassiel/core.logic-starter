(+ 1 1)

(+ 1 (* 2 3))


(+ 1 2 3 90 4.5 -6 100)

(def x 1000)

(* x x)

(defn f [x] (* x x x))

(f -2)

[1 20 -5 10 100]

(defn list-of-two [x]
  [x x])

(list-of-two (list-of-two 99))

(list-of-two (range 100))

(range 100)

(cons 99 (cons 1 [2 3]))

(cons 66 nil)

(* 2 2)

(ns user
  (:require [clojure.core.logic :as L :refer [run* ==]]))

;; ---

(run* [x]
  (== x true))

;; ---

(run* [q]
  (L/membero q [1 2 3])
  (L/membero q [2 3 4])
  (L/membero q [99 100]))

;; ---

(run* [q]
  (L/conde
   [L/succeed]))

(run* [q]
  (L/conde
   [L/succeed]
   [L/succeed]))

(run* [q]
  (L/conde
   [(== q 1)]
   [(== q 2)]
   [(L/membero q [90 91])]))

(run* [q]
  (L/conso 1 [2 3] q))

(run* [q]
  (L/conso 1 q [1 2 3]))

(run* [q]
  (L/conso q [2 3] [1 2 3]))

(run* [q]
  (L/conso 1 [2 q] [1 2 3]))

(run* [q]
  (L/membero q [1 2 3]))

(run* [q]
  (L/membero 7 [1 3 8 q]))

(run* [q r]
  (L/membero 7 [1 3 8 q r]))
