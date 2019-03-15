require "clipboard"

wild_table = File.open("wild table.txt")

arg = ARGV[0]
result = arg.to_i

puts "#{result}"

if result.between?(1,100) then
	effect = "Radix has bad code and you should call him out"
	for i in 1..result do
		effect = wild_table.readline
	end
	Clipboard.copy(effect)
	puts "#{effect}"
else
	Clipboard.copy("Radix did the thing wrong and you should call him an idiot")
	puts "Put in a real number stupid"
end

