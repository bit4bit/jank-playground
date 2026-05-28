(defproject tictactoe "0.1-SNAPSHOT"
  :license {:name "MPL 2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies []
  :plugins [[org.jank-lang/lein-jank "0.6"] [lein-cljfmt "0.9.2"]]
  :middleware [leiningen.jank/middleware]
  :main tictactoe.main
  :profiles {:base {:jank {:output-dir "target/debug"
                           :optimization-level 0
                           :include-dirs ["/usr/local/include"]
                           :library-dirs ["/usr/local/lib"]
                           :linked-libraries ["raylib"]
                           }}
             :release {:jank {:output-dir "target/release"
                              :optimization-level 2}}})
