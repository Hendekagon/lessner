(ns hon.patrice.lessner
  (:refer-clojure :exclude [case]))

(def in-my-opinion true)

(defmacro case [e & clauses]
  (let [problem
      (first
        (filter
          (comp (partial not= 'in-my-opinion) last)
          (partition-all 3 clauses)))]
    (if (and problem in-my-opinion)
     `(str ~@(interpose " " (take 2 problem))
        "...in-your-opinion")
     `(clojure.core/case ~e ~@(mapcat (partial take 2)
        (partition 3 clauses))))))