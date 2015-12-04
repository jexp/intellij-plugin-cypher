data = <<eof
Abs
Acos
Asin
Atan
Atan2
Avg
Ceil
Coalesce
Collect
Ceil
Cos
Cot
Count
Degrees
E
EndNode
Exists
Exp
Floor
Has
Haversin
Head
Id
Labels
Last
Left
Length
Log
Log10
Lower
LTrim
Max
Min
Nodes
Pi
PercentileCont
PercentileDisc
Keys
Radians
Rand
Range
Reduce
Relationships
Rels
Replace
Reverse
Right
Round
RTrim
Sign
Sin
Size
Sqrt
Split
StartNode
StdDev
StdDevP
Str
Substring
Sum
Tail
Tan
Timestamp
ToFloat
ToInt
ToLower
ToString
ToUpper
Trim
Type
Upper
eof

functions = data.split("\n")

def regexp fun
  "(#{fun.split("").map{|c| "(#{c.upcase}|#{c.downcase})"}.join})"
end

puts functions.sort_by(&:length).reverse.map {|fun| regexp fun}.join("|")
