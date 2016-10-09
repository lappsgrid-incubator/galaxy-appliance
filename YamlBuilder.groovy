/*
 * A Groovy script that can be used to generate a docker-compose.yml
 * file needed to run all the Docker containers that make up a
 * LAPP Grid Galaxy Appliance.
 */
 
if (args.size() == 0) {
	println '''
USAGE 
    groovy YamlBuilder.groovy module [module ...]

EXAMPLE
    groovy YamlBuilder.groovy masc oaqa lingpipe gate stanford
    
'''
	return
}

int port = 8000

println "version: '2'"
println "services:"
args.each {
	println "    ${it}:"
	println "        build: $it"
	println "        image: lappsgrid/$it"
	println "        ports:"
	println "            - ${++port}:8080"
}

println """    galaxy:
        build: build
        image: lappsgrid/galaxy-appliance
        ports:
            - "80:80"
        depends_on:"""
args.each {
	println "            - $it"
}
println "        links:"
args.each {
	println "            - $it"
}
	