let Avatar = ["Avatar", 40, 35, 50, 25, 40, 55, 25, 25];
let Chrom = ["Chrom", 45, 40, 10, 40, 40, 70, 35, 20];
let Lissa = ["Lissa", 35, 25, 35, 30, 35, 65, 15, 35];
let Frederick = ["Frederick", 60, 40, 10, 40, 35, 40, 40, 20];
let Sully = ["Sully", 40, 35, 20, 40, 40, 60, 35, 20];
let Virion = ["Virion", 35, 40, 30, 40, 45, 40, 25, 25];
let Stahl = ["Stahl", 50, 45, 10, 35, 30, 50, 50, 10];
let Vaike = ["Vaike", 60, 50, 10, 45, 35, 45, 40, 5];
let Miriel = ["Miriel", 35, 15, 40, 40, 40, 50, 20, 30];
let Sumia = ["Sumia", 35, 30, 20, 45, 45, 60, 25, 30];
let Kellam = ["Kellam", 50, 40, 15, 40, 35, 35, 55, 30];
let Donnel = ["Donnel", 50, 45, 15, 40, 45, 80, 35, 15];
let Lonqu = ["Lonqu", 40, 35, 20, 50, 50, 55, 25, 20];
let Ricken = ["Ricken", 50, 20, 35, 30, 30, 65, 30, 25];
let Maribelle = ["Maribelle", 30, 20, 40, 40, 30, 80, 10, 40];
let Panne = ["Panne", 60, 45, 15, 50, 55, 40, 40, 15];
let Gaius = ["Gaius", 50, 45, 15, 45, 45, 35, 25, 15];
let Cordelia = ["Cordelia", 50, 45, 15, 35, 35, 45, 40, 25];
let Gregor = ["Gregor", 60, 40, 10, 40, 30, 45, 40, 10];
let Nowi = ["Nowi", 70, 45, 35, 30, 30, 65, 50, 35];
let Libra = ["Libra", 45, 25, 35, 45, 35, 45, 25, 30];
let Tharja = ["Tharja", 40, 25, 45, 25, 45, 40, 35, 20];
let Anna = ["Anna", 45, 30, 30, 35, 35, 80, 30, 30];
let Olivia = ["Olivia", 40, 35, 25, 45, 45, 60, 20, 20];
let Cherche = ["Cherche", 55, 40, 20, 40, 35, 50, 45, 10];
let Henry = ["Henry", 45, 35, 35, 45, 40, 40, 40, 20];
let Sayri = ["Sayri", 50, 35, 20, 40, 40, 45, 35, 30];
let Tiki = ["Tiki", 80, 40, 40, 35, 30, 80, 45, 45];
let Basilio = ["Basilio", 65, 45, 10, 40, 35, 45, 40, 15];
let Flavia = ["Flavia", 50, 35, 20, 45, 45, 55, 30, 25];
let Gangrel = ["Gangrel", 40, 40, 30, 50, 50, 30, 30, 30];
let Walhart = ["Walhart", 75, 60, 10, 30, 30, 45, 45, 25];
let Emmeryn = ["Emmeryn", 45, 10, 55, 40, 40, 70, 25, 35];
let Yenfay = ["Yenfay", 60, 45, 10, 45, 50, 60, 30, 20];
let Aversa = ["Aversa", 45, 25, 45, 35, 40, 65, 30, 30];
let Priam = ["Priam", 80, 60, 10, 40, 30, 50, 40, 10];

let Lucina = ["Lucina", 45, 35, 20, 45, 45, 80, 25, 25];
let Owain = ["Owain", 45, 40, 30, 45, 35, 50, 30, 30];
let Inigo = ["Inigo", 50, 35, 15, 35, 45, 65, 30, 20];
let Brady = ["Brady", 55, 30, 40, 25, 30, 60, 30, 30];
let Kjelle = ["Kjelle", 40, 35, 25, 40, 45, 55, 40, 20];
let Cynthia = ["Cynthia", 45, 35, 20, 25, 45, 70, 30, 30];
let Severa = ["Severa", 45, 40, 10, 45, 35, 35, 40, 30];
let Gerome = ["Gerome", 65, 50, 15, 40, 40, 30, 40, 10];
let Morgan = ["Morgan", 35, 35, 40, 40, 40, 50, 25, 25];
let Yarne = ["Yarne", 70, 50, 10, 45, 40, 60, 45, 10];
let Laurent = ["Laurent", 45, 20, 40, 40, 30, 50, 25, 35];
let Noire = ["Noire", 30, 45, 40, 35, 50, 40, 30, 40];
let Nah = ["Nah", 70, 35, 35, 45, 35, 70, 45, 40];

export let Fathers = {Chrom, Frederick, Virion, Stahl, Vaike, Kellam, Donnel, Lonqu, Ricken, Gaius, Gregor, Libra, Henry, Basilio, Gangrel, Walhart, Priam}
export let Mothers = {Avatar, Lissa, Sully, Miriel, Sumia, Maribelle, Panne, Cordelia, Nowi, Tharja, Anna, Olivia, Cherche, Sayri, Tiki, Flavia, Emmeryn, Yenfay, Aversa}
export let Kids = {Lucina, Owain, Inigo, Brady, Kjelle, Cynthia, Severa, Gerome, Morgan, Yarne, Laurent, Noire, Nah}

export let StaticParents = {
    "Lucina": Chrom,
    "Owain": Lissa,
    "Inigo": Olivia,
    "Brady": Maribelle,
    "Kjelle": Sully,
    "Cynthia": Sumia,
    "Severa": Cordelia,
    "Gerome": Cherche,
    "Morgan": Avatar,
    "Yarne": Panne,
    "Laurent": Miriel,
    "Noire": Tharja,
    "Nah": Nowi
};

export let UnitMap = {
    "Avatar": Avatar,
    "Chrom": Chrom,
    "Lissa": Lissa,
    "Frederick": Frederick,
    "Sully": Sully,
    "Virion": Virion,
    "Stahl": Stahl,
    "Vaike": Vaike,
    "Miriel": Miriel,
    "Sumia": Sumia,
    "Kellam": Kellam,
    "Donnel": Donnel,
    "Lonqu": Lonqu,
    "Ricken": Ricken,
    "Maribelle": Maribelle,
    "Panne": Panne,
    "Gaius": Gaius,
    "Cordelia": Cordelia,
    "Gregor": Gregor,
    "Nowi": Nowi,
    "Libra": Libra,
    "Tharja": Tharja,
    "Anna": Anna,
    "Olivia": Olivia,
    "Cherche": Cherche,
    "Henry": Henry,
    "Sayri": Sayri,
    "Tiki": Tiki,
    "Basilio": Basilio,
    "Flavia": Flavia,
    "Gangrel": Gangrel,
    "Walhart": Walhart,
    "Emmeryn": Emmeryn,
    "Yenfay": Yenfay,
    "Aversa": Aversa,
    "Priam": Priam,
    "Lucina": Lucina,
    "Owain": Owain,
    "Inigo": Inigo,
    "Brady": Brady,
    "Kjelle": Kjelle,
    "Cynthia": Cynthia,
    "Severa": Severa,
    "Gerome": Gerome,
    "Morgan": Morgan,
    "Yarne": Yarne,
    "Laurent": Laurent,
    "Noire": Noire,
    "Nah": Nah
};

