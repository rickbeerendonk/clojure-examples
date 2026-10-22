; European Union Public License version 1.2
; Copyright © 2025 Rick Beerendonk

(println "Hello Clojure")

(print "What is your name? ")

(flush)
(def yourname (read-line))

(print "Hello ")
(println yourname)