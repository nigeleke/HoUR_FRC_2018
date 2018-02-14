package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class RightToRightScale extends AutoDirection {

	private double[] leftMotorSpeeds = { 0.0, 1.8280595337397936, 2.8516123437217287, 3.430681733810224,
			3.758289474960571, 3.9436346539459577, 4.048498134557344, 4.1078289734715225, 4.141403589034968,
			4.160404547642286, 4.171165521440264, 4.17725868984711, 4.180716895276319, 4.182669428001879,
			4.18377507249248, 4.184369184728559, 4.184678393273812, 4.184772709289974, 4.18477938472508,
			4.18472217552647, 4.184661455591813, 4.184594987643503, 4.184553339415416, 4.1845224734162825,
			4.184524370661459, 4.184535547098989, 4.18458018826122, 4.184617877739015, 4.184680687344321,
			4.184693230239066, 4.1847007844005235, 4.184565201451783, 4.184368942408624, 4.183905442717972,
			4.183437808016838, 4.182905868013882, 4.182478133630579, 4.182093351672154, 4.181852705550163,
			4.1816804284079785, 4.181659384280228, 4.181686366070829, 4.181858642245398, 4.182007466473365,
			4.1822643196760465, 4.182318052476294, 4.182354982381376, 4.181805486215015, 4.181008595224715,
			4.179111051350545, 4.1771966388788115, 4.1750164329538375, 4.1732662953061554, 4.171694180647259,
			4.170719421648879, 4.170031163184004, 4.169974366301901, 4.170126269997702, 4.170893371633082,
			4.1715836058895395, 4.172747460678455, 4.173102404121506, 4.173425845367627, 4.171350035756122,
			4.168277324123677, 4.160623632484954, 4.152899129513081, 4.144051493457985, 4.137009144415847,
			4.130726948280821, 4.127000490361183, 4.124553162804754, 4.124895372038241, 4.126298048146724,
			4.130573841174076, 4.134871850855267, 4.141668344510971, 4.145559392581086, 4.149996809657543,
			4.144636269263308, 4.13547731071627, 4.106151508288183, 4.076464265610599, 4.041487114692876,
			4.014664843206097, 3.9915016014450746, 3.980773235702296, 3.9772625854904446, 3.9889089764998187,
			4.008845954757769, 4.047160431488858, 4.092173233345144, 4.1579830985771995, 4.2198323949151355,
			4.29605089609503, 4.330460019949442, 4.34885880886205, 4.2434508977260155, 4.116204041175706,
			3.9296396290551576, 3.7584137690761295, 3.5781023000373766, 3.43140920329733, 3.2977676691052515,
			3.199697843789408, 3.119687727011255, 3.070550542654223, 3.0363544798526063, 3.0263770838547464,
			3.0221104246275874, 3.0321441491938352, 3.0282382285587386, 3.0218706800238504, 2.9707785876648685,
			2.915394471768017, 2.8425979759381734, 2.778572454785893, 2.7144741117448254, 2.6636045556253753,
			2.618606132458687, 2.5858586793617233, 2.5594611875753803, 2.5428057003542217, 2.5309372368094363,
			2.5262098912857627, 2.5233699364805373, 2.5245574353774787, 2.5223779067445564, 2.5197370627644604,
			2.5062246212329633, 2.4918106478388595, 2.4733741040529273, 2.457047124576323, 2.440736053409007,
			2.4273126888369014, 2.415124901557793, 2.405294897861199, 2.3966970784208623, 2.3896127844095325,
			2.383496914831532, 2.3782116064803676, 2.3738688181637935, 2.3700684788119513, 2.367751037796833,
			2.366125747947748, 2.3669570841436878, 2.367764487479244, 2.369054263818941, 2.369012184214994,
			2.368222373844542, 2.365245559248608, 2.360958838169252, 2.3537895699747207, 2.345231025564181,
			2.33321090725243, 2.3206267855489795, 2.304704289545603, 2.291296415056509, 2.276729067990434,
			2.2720887339182405, 2.271172338032949, 2.2906055903616505, 2.3107011943933986, 2.336190450276649,
			2.354391917216745, 2.369670807454896, 2.374227616119991, 2.373328806024857, 2.360565348857265,
			2.343269834430543, 2.3143140382719074, 2.285929935794136, 2.2491907813141343, 2.2260624148700847,
			2.204422053604029, 2.2212322439244234, 2.254325732468284, 2.352530281686542, 2.4517824771038703,
			2.564815265273588, 2.6555706026988646, 2.7378883904530036, 2.7933646884308176, 2.839062573961168,
			2.8628440311862953, 2.8872766328079105, 2.900779090599815, 2.9366568045011703, 2.980307014138957,
			3.0808552366945694, 3.213771329073453, 3.4422478371253744, 3.714219262529717, 4.090273123044775,
			4.450931140626633, 4.805681847014632, 5.104747803702663, 5.365457799786262, 5.573304189959615,
			5.745997785479475, 5.881071850443627, 5.992739785886299, 6.081502828305567, 6.158480433563851,
			6.224056599715683, 6.28805125053597, 6.349282973049468, 6.417881337274999, 6.48860642674725,
			6.571464024106184, 6.649598905817813, 6.725235510377412, 6.789847127879275, 6.846592870033297,
			6.8925703474786415, 6.931154712208836, 6.9617660048143, 6.987271824662924, 7.007766821662658,
			7.025580768450594, 7.040816049062596, 7.055563323934645, 7.069592632392787, 7.085086776629213,
			7.1009385827536375, 7.119377375526573, 7.136709785610985, 7.153451319186813, 7.167654815003785,
			7.180010625133684, 7.189798165015328, 7.197740574706599, 7.20362991151007, 7.2080617023086155,
			7.210969657608244, 7.212820366908716, 7.2135481786758255, 7.2135928962166185, 7.212861198844228,
			7.211932620615071, 7.210660109566092, 7.209859776634427, 7.208888052627882, 7.207960603568006,
			7.206585152146134, 7.204806462198693, 7.202253832189747, 7.198861069958171, 7.194276357009274,
			7.188329641083953, 7.1806275776900845, 7.170941614327402, 7.158869723279755, 7.144298087302165,
			7.127030183382375, 7.10748400066826, 7.0860912557052735, 7.0642736479601105, 7.042814392734801,
			7.022162934024099, 7.002057526971114, 6.9820225410200605, 6.961121125637655, 6.9383585121656,
			6.912363093194891, 6.881813314137383, 6.844988422740716, 6.8004539115105045, 6.746407113284642,
			6.682018598598665, 6.606373654327406, 6.521107088072994, 6.428083520065774, 6.333704524502362,
			6.241191111013292, 6.15271047471247, 6.066702984310447, 5.981263504164632, 5.891744556441671,
			5.793947331889011, 5.6809537430714885, 5.547010836346468, 5.382710594596622, 5.181661425066694,
			4.932237150659475, 4.6317826780830185, 4.270517319456774, 3.8655018884564964, 3.4211683940692414,
			3.011746092461463, 2.6335470879429272, 2.3353156149497263, 2.086428545604473, 1.9105184947963747,
			1.7663989797277524, 1.664761297175976, 1.5675265918069874, 1.4817306267994275, 1.3760376192557315,
			1.2597052066287688, 1.106138503863428, 0.9360287194679872, 0.7278735957740485, 0.5389044772831978,
			0.3598323023246276, 0.2565016862003753, 0.22523800585451703, 0.18081416947601303, 0.1853152109085349,
			0.2233006090033558, 0.26686535784078597, 0.3305622084829668, 0.3721449020484909, 0.40769276089725015,
			0.4111011416565035, 0.40046271615602985, 0.3573828878181514, 0.3081668033858998, 0.23921826999074006,
			0.20002055705878374, 0.18137060869010815, 0.15965493047765042, 0.17132369381451928, 0.230901487979008,
			0.2911114262652524, 0.3646597416184184, 0.42324738432573794, 0.478227905628253, 0.514616777023712,
			0.5422782612665186, 0.5523002665189567, 0.5540123230520696, 0.5406863056046282, 0.5240045872770378,
			0.4978087277212301, 0.4810358739708381, 0.4659266860691173, 0.4813783859723683, 0.5004894088283197,
			0.532149389498473, 0.5585293075330006, 0.5854690027710763, 0.603097488664742, 0.6164378283719194,
			0.619508956573249, 0.6170428504300037, 0.6042249118950328, 0.5867610360289562, 0.5596673659207899,
			0.5322835238365361, 0.498958007581106, 0.47685265561924994, 0.4576821226747352, 0.4680769635272172,
			0.4803977636779402, 0.5025213849713166, 0.5157915352393009, 0.5261953467859062, 0.5219712214187493,
			0.5096077696204779, 0.4797557768705377, 0.4413203810329642, 0.3849901345370081, 0.327033102280376,
			0.2589851328741958, 0.21566858003841308, 0.19570545672789377, 0.19408496958030685, 0.21596222298862852,
			0.17866947581885767, 0.16535431443697146, 0.1656211413439806, 0.17395639323413356, 0.1965704895387734,
			0.19832504131388343, 0.20332617198260006, 0.19872799138859748, 0.2371270886210522, 0.3381633433637652,
			0.4611157142922685, 0.6287383468927452, 0.7589440883619661, 0.891972191821572, 0.9096161064081496,
			0.8927581712103022, 0.7132020809048065, 0.586266672536898, 0.5268787037675257, 0.5715080988958372,
			0.681793369716997, 0.787533823211113, 0.8921901353396642, 0.9716173479010223, 1.0374887963940103,
			1.0801014651199976, 1.1115630896820996, 1.1261589379765693, 1.1372734609765343, 1.1397240506554243,
			1.151659188021225, 1.1653352414993543, 1.2044838422220572, 1.244335026459742, 1.2915276828548226,
			1.3318473213238367, 1.3702188093826209, 1.400188253521552, 1.425921170682151, 1.4445802662351244,
			1.4594301685643236, 1.4690105250654606, 1.4759979544655433, 1.4793343191403812, 1.4818015664511253,
			1.4823515199633142, 1.4847968315630344, 1.4875675703321536, 1.4958550030828346, 1.504390972963684,
			1.5146851607671141, 1.523568661091456, 1.5321289473516289, 1.5388657740388745, 1.5447012883890163,
			1.5489553106624305, 1.5523618168360922, 1.5545664527521292, 1.5561809292011444, 1.5569503755491425,
			1.5575199131215265, 1.5576402282145636, 1.5582069258933917, 1.558851208232859, 1.5608074059366515,
			1.5628288602853309, 1.5652777475459931, 1.5673962719888421, 1.5694438231953567, 1.5710582594624336,
			1.5724596870792893, 1.5734828155745755, 1.5743034458637648, 1.5748352826551946, 1.5752253353278698,
			1.575411688475364, 1.5755497834630134, 1.5755792643331055, 1.5757164342311945, 1.5758722952556834,
			1.576345730469807, 1.576835327942323, 1.577428969559335, 1.5779430322640888, 1.5784403115908183,
			1.5788329406124282, 1.5791740798818015, 1.5794236293802677, 1.579623735060054, 1.5797533352912498,
			1.5798467742403677, 1.5798881176700772, 1.5799114318652123, 1.5798982958662124, 1.5798910412896139,
			1.579855209153416, 1.5798350197925202, 1.579717279099577, 1.579444519834823, 1.5788373223535903,
			1.5776669527136948, 1.575484162033085, 1.571541271661291, 1.5644876131042529, 1.5519588500255954,
			1.5297571743297151, 1.4904738731989613, 1.4210019328541454, 1.2981788887689172, 1.0810563559282222,
			0.6972565355822153, 0.0,

	};

	private double[] rightMotorSpeeds = { 0.0, 1.8280411621398147, 2.8515739535800773, 3.4306210826419608,
			3.7582013778005376, 3.943514270088213, 4.0483356731437805, 4.107616546692756, 4.14112541829022,
			4.160050052165843, 4.170712324416745, 4.1766970943787785, 4.180021047302297, 4.181842487103457,
			4.182799779530361, 4.1832882492506505, 4.183503383783065, 4.183611883667124, 4.183637351468889,
			4.183631944287421, 4.183583297125699, 4.1835110841148735, 4.183395378861197, 4.183246546521003,
			4.18303965554395, 4.182785541814948, 4.1824520188253285, 4.18206151893495, 4.1815741113841325,
			4.181045155239535, 4.180431000457294, 4.179856570823271, 4.179269909223667, 4.178885696465042,
			4.178518953742855, 4.1782334534273815, 4.17788487462651, 4.177506680374045, 4.176985649047965,
			4.176349923146722, 4.175486309489715, 4.174435185995868, 4.173060361962922, 4.171453009759681,
			4.1694473159380925, 4.167270926830689, 4.164743478519779, 4.1623798935674, 4.159965998110034,
			4.158388208069634, 4.156882992418072, 4.155714075692835, 4.154284813428338, 4.152733546767383,
			4.150591813559928, 4.147975739266401, 4.144416491892552, 4.140080178087601, 4.134401504742116,
			4.127755991347737, 4.119453429399592, 4.11043607506878, 4.099951689357395, 4.090145822145325,
			4.080126643906852, 4.073614510073562, 4.067405673285677, 4.062613215666414, 4.056713261697081,
			4.050288556320478, 4.0413445236615555, 4.0303672853767765, 4.015345322226494, 3.996968698663131,
			3.9727856050039025, 3.94437061869978, 3.908692789990186, 3.8697935586543832, 3.824345346076652,
			3.781821795344054, 3.738319558198293, 3.710793657276062, 3.684736091321602, 3.6653548084993055,
			3.6408615277559275, 3.6139561611793196, 3.575129940062249, 3.5265611731080915, 3.4584465635399364,
			3.3737550610178895, 3.2601308916431173, 3.1246535454255375, 2.9515478672640083, 2.7610448733539132,
			2.5362043920633375, 2.331199542451248, 2.129661821590272, 2.0435189784844408, 1.992254913863902,
			2.016655099288651, 2.049821361358818, 2.1132031805109737, 2.164263552522858, 2.2187520483055536,
			2.2520281495568253, 2.277229398154192, 2.279305079666106, 2.270753437243036, 2.240641224676832,
			2.2049593493629747, 2.1545115965717634, 2.116131375295846, 2.079647842725061, 2.0875405416510655,
			2.103351755268245, 2.140554982246283, 2.174408998303464, 2.2130190410805763, 2.2430827561124533,
			2.2709135118098285, 2.28968599321619, 2.3043725766450645, 2.3111132720583747, 2.314141498131108,
			2.310751804748284, 2.305672828681824, 2.296617614543298, 2.2906814993145064, 2.285179979806952,
			2.2905483763856607, 2.2975637143153738, 2.3094286367796526, 2.3203083140648686, 2.3321932723838126,
			2.342247974462933, 2.351983159730575, 2.360239092019422, 2.368049805230274, 2.3751027582462054,
			2.381924188199948, 2.388636503782863, 2.395164293621394, 2.4018619786779625, 2.407823008116948,
			2.4136521026523714, 2.417527814915099, 2.4214974633496666, 2.4250476132151753, 2.429875995557899,
			2.4355937824734113, 2.443745731444344, 2.4537971231679783, 2.4675529237286455, 2.4839957102082013,
			2.505501908652444, 2.5297877677539824, 2.5599045303228087, 2.590680310218092, 2.6257466490151318,
			2.654476584662681, 2.682052862598143, 2.691585543282529, 2.7001011318363832, 2.702747278390584,
			2.711375305250013, 2.7225841143132996, 2.744600447825605, 2.7738330233166466, 2.8177786317291327,
			2.871351682276744, 2.9431121260842956, 3.0236572011382097, 3.1232457744247295, 3.223035173806402,
			3.3350994387311093, 3.42462316810816, 3.5093787836054, 3.5394035060717184, 3.5669005487470757,
			3.578467181347389, 3.6062930273285976, 3.6406429721630813, 3.7016410784026728, 3.7794549596304248,
			3.890856377572122, 4.022932602180226, 4.193309514668663, 4.3806482374030855, 4.604841131396982,
			4.829433926207475, 5.0773843240045755, 5.292599844164581, 5.5048543412903355, 5.643964571088097,
			5.771990850147828, 5.869096039761204, 5.9612117187342095, 6.03721905042277, 6.108862415780369,
			6.17080746537212, 6.230337137361523, 6.285410803177083, 6.34158261430109, 6.397860304703691,
			6.458715984469943, 6.522128465514425, 6.591171458830207, 6.660284038973675, 6.7305150216864424,
			6.791160201391976, 6.845732728474967, 6.890568246121447, 6.928964422336993, 6.959983844909348,
			6.986246100393194, 7.0078020680842545, 7.026627696368494, 7.043033824537101, 7.058513999053306,
			7.073296651377316, 7.08851623691329, 7.104004485757188, 7.120496995487662, 7.136928787577083,
			7.1534906003107706, 7.1678271647667025, 7.180610432125684, 7.190997025243634, 7.199735701506863,
			7.206604914371221, 7.21222514326562, 7.21657231311634, 7.220106876404491, 7.222822469451642,
			7.225056947873825, 7.226734283979934, 7.228118698116821, 7.228986201861016, 7.229572348081339,
			7.229404039786845, 7.228786053309397, 7.226972970109589, 7.224849135933307, 7.22216417199899,
			7.219421037802957, 7.216341784084059, 7.213122276728868, 7.20940345569251, 7.205219339407449,
			7.200097644881927, 7.19401093833322, 7.186312453273419, 7.177022878025455, 7.165263752716387,
			7.151340304323126, 7.134175786249038, 7.114938658568148, 7.092639351472513, 7.07056104721287,
			7.048432137622018, 7.027759855778828, 7.007541799787177, 6.988058875077505, 6.967767404308421,
			6.946412914068814, 6.921951297468025, 6.894015289686434, 6.859868677342417, 6.819475525419557,
			6.769172370039697, 6.710223809358475, 6.638072601796176, 6.55766349755345, 6.464459406184637,
			6.372668307972623, 6.281035357095269, 6.196604792055294, 6.115305587792026, 6.039303652384548,
			5.962573603644063, 5.885641819313035, 5.800941875915796, 5.709855070599784, 5.602679276324621,
			5.48451665177908, 5.341492233795672, 5.186639280848223, 4.9942680609006675, 4.790921127623094,
			4.515656060947233, 4.248304052868344, 3.9531179290696885, 3.691063399771679, 3.4295228505867743,
			3.2124098033806785, 3.0124122248039544, 2.860919371217167, 2.7350812641963955, 2.65851417356763,
			2.609479550275421, 2.6093054906254745, 2.6291865870823186, 2.69131387845203, 2.738130984160263,
			2.7934982978130876, 2.7340301762614314, 2.654281972145784, 2.497524173132636, 2.3472110262332837,
			2.1686298430366855, 2.0201001868655366, 1.8755466354851278, 1.7713064845477258, 1.6852888611136236,
			1.6405825525396862, 1.615836594824693, 1.6284021193931355, 1.651010545595514, 1.6991304222917725,
			1.7264383561338663, 1.7510763933272098, 1.696450853418662, 1.6300896477051185, 1.526203516687209,
			1.432693268405248, 1.333405324500495, 1.2550211654311798, 1.184403981397487, 1.1356415428334001,
			1.09780305092152, 1.0792419385619818, 1.0699330148442623, 1.0762607158008644, 1.0860743681960872,
			1.10540385467583, 1.1150564702191195, 1.1229963006151253, 1.1003525490793487, 1.074684309914262,
			1.037162277008141, 1.0058601987032152, 0.9748256015617787, 0.9539398390303822, 0.9380249471687618,
			0.9330041098020779, 0.9340212606513926, 0.9458356207845395, 0.9626661438999262, 0.9894624961452211,
			1.016853873911005, 1.0504729513262843, 1.0731544156476729, 1.0931542090674657, 1.083839666395024,
			1.0727758238093066, 1.0521160451267673, 1.0405421980344554, 1.0322199914559578, 1.039111100716852,
			1.0551338300433535, 1.0902277708334194, 1.1365591437494451, 1.205120724615477, 1.282645305121815,
			1.3825489818977463, 1.478817035238559, 1.5878108064868737, 1.6601166159340455, 1.7211630730807725,
			1.6967288168800152, 1.6678894567594151, 1.6138697221658043, 1.5869915146478992, 1.570345842152512,
			1.5962608889298089, 1.6456578704321065, 1.7445983782610914, 1.8669512172640101, 2.040087568891646,
			2.22041394733336, 2.4397559780570073, 2.621868402209743, 2.8074465243021542, 2.876921672112398,
			2.9006297312612577, 2.735072530046002, 2.5601637315579695, 2.3437812269986376, 2.168482469146984,
			2.0060577494628737, 1.8877548465930343, 1.7906285435820508, 1.7273515586793897, 1.6815457748169118,
			1.6600844773491954, 1.6505463822596755, 1.6583005594879525, 1.6707485438211318, 1.693031090790759,
			1.707661084678291, 1.7214320135714107, 1.7103994677487055, 1.6966570494538327, 1.673245656374661,
			1.6533174990844373, 1.6323686500357926, 1.6167824140807374, 1.6030667612219864, 1.5943317364648184,
			1.5879468946764526, 1.5856898736251146, 1.585401567681083, 1.5883896279266898, 1.5922663971279414,
			1.5981792475790346, 1.6025463795991748, 1.6067356651818614, 1.6055254519078779, 1.6035310577111166,
			1.5991744940018888, 1.5953692749407713, 1.5911387591516866, 1.5879704081818742, 1.585112032576439,
			1.583313548639829, 1.581999167638154, 1.5816025863123022, 1.581640393015962, 1.5824293774344824,
			1.5834217843549587, 1.584891491253181, 1.5859997561030603, 1.5870657570586526, 1.5868477605832,
			1.5864322418621952, 1.58544042868096, 1.5845676505188824, 1.5835818666911763, 1.5828422295607196,
			1.5821703946914767, 1.5817488202319057, 1.5814405063577144, 1.5813512158288654, 1.5813653675484067,
			1.5815600478967813, 1.5818036392189885, 1.5821625192770956, 1.58243428698856, 1.582695838148373,
			1.5826464863739511, 1.5825485559242167, 1.5823100997238784, 1.5820994720274209, 1.5818604795782416,
			1.5816801510257052, 1.5815153040796184, 1.5814098976692887, 1.581330654802137, 1.5813024132582105,
			1.581296756230718, 1.5813303862357602, 1.5813698231858624, 1.5814259526934416, 1.5814438106302773,
			1.5814269276043829, 1.5812808910527802, 1.5810218347192333, 1.580550641327049, 1.5797680986516256,
			1.5784181625021247, 1.5760903875565346, 1.5720154847349914, 1.5648597433499247, 1.5522430499125326,
			1.529974547589787, 1.4906349698433843, 1.4211198478386071, 1.2982600964384197, 1.0811077909488145,
			0.6972811972114532, 0.0, };

	public int nSteps() {
		return leftMotorSpeeds.length;
	}

	public double leftSpeed(int i) {
		return leftMotorSpeeds[i];
	}

	public double rightSpeed(int i) {
		return rightMotorSpeeds[i];
	}

}
