(ns structured-data)

(defn do-a-thing
  "Doubles x, let's call the double to be y. Then
  raises y to the y power."
  [x]
  (let [y (+ x x)]
    (Math/pow y y)))

(defn spiff
  "Takes a vector and returns the sum of the first and third
  elements of the vector."
  [v]
  (let [x (get v 0)
        y (get v 2)]
    (+ x y)))

(defn cutify
  "Takes a vector and adds \"<3\" to its end."
  [v]
  (conj v "<3"))

(defn spiff-destructuring
  "Rewrite our of function spiff by destructuring its parameter."
  [v]
  (let [[x y z] v]
    (+ x z)))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width
  "Using destructuring, returns the width of the
  given triangle."
  [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- x2 x1)))

(defn height
  "Using destructuring, returns the height of the
  given triangle."
  [rectangle]
  (let [[[x1 y1] [x2 y2]] rectangle]
    (- y2 y1)))

(defn square?
  "Returns true if rectangle is a square,
  otherwise it returns false."
  [rectangle]
  (let [x (width rectangle)
        y (height rectangle)]
    (if (= x y) true false)))

(defn area
  "Returns the area of the given triangle."
  [rectangle]
  (let [x (width rectangle)
        y (height rectangle)]
    (* x y)))

(defn contains-point?
  "Returns true if rectangle contains point,
  otherwise returns false"
  [rectangle point]
  (let [[[x1 y1] [x2 y2]] rectangle
        [x3 y3] point]
    (cond
      (and (<= x1 x3 x2) (<= y1 y3 y2)) true
      :else false)))


(defn contains-rectangle?
  "Returns true if the rectangle inner is
  inside the rectangle outer and otherwise
  false"
  [outer inner]
  (let [[[x1 y1] [x2 y2]] inner]
    (contains-point? outer [x2 y2])))

;; Defining a few books with maps and vectors
;; Use these in REPL to test the following functions:
;
;(def china {:name "China Miéville", :birth-year 1972})
;(def octavia {:name "Octavia E. Butler"
;              :birth-year 1947
;              :death-year 2006})
;(def friedman {:name "Daniel Friedman" :birth-year 1944})
;(def felleisen {:name "Matthias Felleisen"})
;
;(def cities {:title "The City and the City" :authors [china]})
;(def wild-seed {:title "Wild Seed", :authors [octavia]})
;(def embassytown {:title "Embassytown", :authors [china]})
;(def little-schemer {:title "The Little Schemer"
;                     :authors [friedman, felleisen]})

(defn title-length [book]
  (count (get book :title)))

(defn author-count [book]
  (count (get book :authors)))

(defn multiple-authors? [book]
  (if (> (author-count book) 1)
    true
    false))

(defn add-author [book new-author]
  (let [v (get book :authors)
        c (conj v new-author)]
    (assoc book :authors c)))

(defn alive? [author]
  (not (contains? author :death-year)))

(defn element-lengths [collection]
  (map count collection))

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
