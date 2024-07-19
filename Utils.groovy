// Function to count total nucleotides in a FASTA file
def getFastaSize(fastaFilePath) {
    File fastaFile = new File(fastaFilePath)
    if (!fastaFile.exists()) {
        println "File not found: $fastaFilePath"
        return
    }
    
    int totalNucleotides = 0
    
    fastaFile.eachLine { line ->
        line = line.trim()
        if (!line.startsWith(">")) {
            // Add length of this line to total nucleotides count
            totalNucleotides += line.length()
        }
    }
    
    return totalNucleotides
}
