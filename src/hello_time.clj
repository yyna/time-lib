(ns hello-time
  (:require [java-time.api :as t]))

(defn now
  []
  (t/instant))

(defn time-str
  [instant]
  (t/format
   (t/with-zone (t/formatter "hh:mm a") (t/zone-id))
   instant))