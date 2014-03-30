(ns noeq-test
  (:require [clojure.test :refer :all]
            [noeq :refer :all]))

(deftest generates-ids-test
  (let [id-generator (new-id-generator "" "localhost:4444")
        first-id (id-generator)
        second-id (id-generator)]
    (is (< first-id second-id))))

(deftest generates-the-number-of-ids-asked-for-test
  (let [id-generator (new-id-generator "" "localhost:4444")]
    (is (= 5 (count (id-generator 5))))))
