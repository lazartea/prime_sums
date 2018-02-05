(ns range-sum-printifprime.core
  (:gen-class))

(defn sum-digits
    "sum all digits in a number"
    [n]
    (loop [x n result 0]
        (if (>= x 1)
            (recur
                (quot x 10)
                (+ result (mod x 10))) result)))

(defn is-prime
    "determine if a number is prime"
  [n]
  (loop [i 2]
      (if (not= 2 n)
          (if (> n 1)
          (if (<= i (Math/sqrt n))
            (if (not= 0 (mod n i))
              (recur (inc i))
              false)
            true)
            false)
          true)))

(defn list-prime
    "list the prime sums"
    []
    (doseq [x (range 1 100001)
      :let [y (sum-digits x)]
      :when (is-prime y)]
  (println y)))

(defn -main
  [& args]
  (list-prime))