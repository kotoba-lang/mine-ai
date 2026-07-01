(ns mine_ai-test
  (:require [clojure.test :refer [deftest is testing]]
            [mine_ai]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? mine_ai))))
