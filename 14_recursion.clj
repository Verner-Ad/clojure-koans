(ns koans.14-recursion
  (:require [koan-engine.core :refer :all]))

(defn is-even? [n]
  (if (= n 0)
    true
    (not (is-even? (dec n)))))

(defn is-even-bigint? [n]
  (loop [n   n
         acc true]
    (if (= n 0)
      acc
      (recur (dec n) (not acc)))))

(defn recursive-reverse [coll]
 (if (empty? coll)
  []
  (concat (recursive-reverse (rest coll)) (list (first coll))))) 


(defn factorial [n]
  (loop [n n acc 1]
    (if (= n 1)
      acc
      (recur (dec n) (* acc n)))))
