#use prototypes
import cpa.subos.io.file.FileFilters;

var File = java("cpa.subos.io.IO").file;
prototypes.string.file = File;

File.AUDIO = FileFilters.AUDIO;
File.PICTURE = FileFilters.PICTURE;