(ns noeq
  (:import com.github.noeq.Noeq))

(defn get-n
  ([^Noeq client] (.getOne client))
  ([^Noeq client n] (.get client (int n))))

(defn connect [token locations]
  (Noeq. token locations))

(defn new-id-generator [token locations]
  (let [client (connect token locations)]
    (fn
      ([] (get-n client))
      ([n] (get-n client n)))))
