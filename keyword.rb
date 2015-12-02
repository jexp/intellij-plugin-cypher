k = ARGV.join(" ").upcase

name = k.gsub(" ", "_")
regexp = k.split("").map{|c| c == " " ? " " : "(#{c.upcase}|#{c.downcase})"}.join

`echo "#{name}=\\"regexp:#{regexp}\\"" | pbcopy`
