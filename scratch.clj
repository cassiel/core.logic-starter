(ns user
  (:require [clojure.core.logic :as L :refer [run* ==]]))

(range 10)

;; ---

(run* [q]
  (== q true))

;; ---

(run* [q]
  (L/membero q [1 2 3])
  (L/membero q [2 3 4]))

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
   [(== q 2)]))

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
