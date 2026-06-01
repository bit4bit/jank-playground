(defproject jphone "0.1-SNAPSHOT"
  :license {:name "MPL 2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies []
  :plugins [[org.jank-lang/lein-jank "0.6"]]
  :middleware [leiningen.jank/middleware]
  :main jphone.main
  :jank {
         :include-dirs ["/usr/local/include"]
         :library-dirs ["/usr/local/lib"]
         :linked-libraries ["pjsua2" "pjsip" "pjmedia"]
         }
  :profiles {:base {:jank {:output-dir "target/debug"
                           :optimization-level 0
                           }}
             :release {:jank {:output-dir "target/release"
                              :optimization-level 2
                              }}})
