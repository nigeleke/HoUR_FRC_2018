package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class RightToLeft extends AutoDirection{
	
	public RightToLeft() {
		super(Config.RIGHT_TO_LEFT_COMPENSATION);	
		}

	double[] LeftMotorSpeeds = {
			0.0, 
			0.22301073269228935, 
			0.34809594656470305, 
			0.41886097543277084, 
			0.4588944984280804, 
			0.481541651926093, 
			0.4943520500078148, 
			0.5015969441293924, 
			0.5056922647997235, 
			0.5080050803689432, 
			0.5093079841425652, 
			0.5100386720446319, 
			0.5104434901053122, 
			0.5106631392898112, 
			0.5107753259558572, 
			0.5108268765811778, 
			0.5108415745901022, 
			0.5108386311380372, 
			0.5108245577248005, 
			0.5108125870865383, 
			0.5107989309016533, 
			0.510787668162706, 
			0.5107746179971294, 
			0.5107613711378493, 
			0.5107444150299216, 
			0.5107244975817424, 
			0.5106981423058294, 
			0.5106658526691424, 
			0.5106234043254358, 
			0.5105717705845771, 
			0.5105054199833295, 
			0.5104274179036623, 
			0.510330985047936, 
			0.5102249517943814, 
			0.5101024130814945, 
			0.5099845857763192, 
			0.5098645073074645, 
			0.5097797968137276, 
			0.5097027649235863, 
			0.5096448129421224, 
			0.5095843041933259, 
			0.50952617319296, 
			0.5094542897717979, 
			0.5093713198231653, 
			0.5092622886766335, 
			0.509129211063261, 
			0.5089544014042353, 
			0.5087418991393564, 
			0.508468756924664, 
			0.5081476595195786, 
			0.5077505380478428, 
			0.5073139184044891, 
			0.5068092078652169, 
			0.5063243260377884, 
			0.5058304197636531, 
			0.5054837658130908, 
			0.5051691106060404, 
			0.5049339209530616, 
			0.5046879023739369, 
			0.5044517107781068, 
			0.5041580368305778, 
			0.5038181907727579, 
			0.5033697234765941, 
			0.5028212591283143, 
			0.5020989164131844, 
			0.5012197247142152, 
			0.5000874387794658, 
			0.4987552703786705, 
			0.4971048770445489, 
			0.49529028782530027, 
			0.4931903358595206, 
			0.4911792945212762, 
			0.4891342436699192, 
			0.48772772489839855, 
			0.4864596029814237, 
			0.4855359171314609, 
			0.484560103521882, 
			0.4836235488077558, 
			0.48242976753636463, 
			0.48103114363577204, 
			0.47915210086182325, 
			0.47683371158357274, 
			0.47374655530715143, 
			0.46996799167293063, 
			0.46506102803846305, 
			0.459265015775108, 
			0.45203060879237034, 
			0.4440690570468684, 
			0.43480693998932063, 
			0.4260458462673572, 
			0.41719848687547784, 
			0.41165728615988445, 
			0.40684544658729005, 
			0.4038450924452307, 
			0.40051191654507967, 
			0.39735857217808374, 
			0.39276449969316374, 
			0.38707384666675054, 
			0.3787870437215752, 
			0.36821827466302715, 
			0.35355162957193204, 
			0.33535481200382755, 
			0.3111738313432595, 
			0.2827228602856932, 
			0.24698952887854012, 
			0.2093646826365368, 
			0.1672547487015771, 
			0.1350461714224497, 
			0.11033777258727004, 
			0.11396118971925444, 
			0.12861828567040529, 
			0.15923455543386553, 
			0.1894568121054903, 
			0.22193853175249378, 
			0.24875616896438374, 
			0.2728917774421274, 
			0.29113587510673133, 
			0.3061386680216529, 
			0.3165383965901162, 
			0.3244430464046193, 
			0.3290541106676564, 
			0.33223885682776305, 
			0.3332788599491494, 
			0.33437258505049244, 
			0.3346776548770402, 
			0.3373865866393448, 
			0.3410235215188517, 
			0.34978471650671067, 
			0.35883924729313466, 
			0.369235097091528, 
			0.37824602033680366, 
			0.38672226191096015, 
			0.39348273431147185, 
			0.3992922041018412, 
			0.40368171809780495, 
			0.4072492600308334, 
			0.4097924460196981, 
			0.41176086197227024, 
			0.41302561108122526, 
			0.41397098318334324, 
			0.41446568938961026, 
			0.41495142047484246, 
			0.41526008725038926, 
			0.41603894093696103, 
			0.41698747729808827, 
			0.41899429891651, 
			0.4210468125913329, 
			0.4233828264880752, 
			0.42540819731345925, 
			0.4273122847099736, 
			0.4288259961949258, 
			0.4301187391150408, 
			0.4310772077253894, 
			0.4318344639142528, 
			0.4323362358709996, 
			0.4326832636043611, 
			0.4328362010397985, 
			0.43288360810399873, 
			0.43278401068615047, 
			0.4326472943528463, 
			0.43242529841356536, 
			0.4322957169502303, 
			0.43218637786256, 
			0.4323626873384727, 
			0.4325663497682545, 
			0.4328726764728229, 
			0.43311614747998667, 
			0.4333444080310726, 
			0.4334683349392515, 
			0.4335239851747218, 
			0.4334572962604789, 
			0.4332924128923488, 
			0.4329834596081845, 
			0.4325468901507052, 
			0.4319314769652176, 
			0.4311597894009494, 
			0.43017376824826326, 
			0.42903447668135186, 
			0.4276909875402411, 
			0.42630403986557325, 
			0.4248451307395972, 
			0.42362181103996405, 
			0.42247768704617156, 
			0.42151097183491054, 
			0.42057201576779135, 
			0.4196848851940449, 
			0.4187195941595568, 
			0.41766857769272453, 
			0.41640155348668867, 
			0.4148937985801857, 
			0.4129889765085927, 
			0.4106603509787628, 
			0.4077064379827583, 
			0.40414262441208193, 
			0.399729974856598, 
			0.39464978761738484, 
			0.38869450632203384, 
			0.3824811952364665, 
			0.375924458453997, 
			0.37034121060332137, 
			0.3651196060420993, 
			0.36070842828030236, 
			0.35642397344559174, 
			0.3523698929883236, 
			0.34789451366994195, 
			0.34295087990253087, 
			0.336830351563704, 
			0.32938570553228486, 
			0.31967289265547016, 
			0.30748012926835294, 
			0.2914119292529915, 
			0.27139445817206015, 
			0.24544628529291918, 
			0.21454324688050735, 
			0.17651782959216497, 
			0.13664307677314047, 
			0.0941639624783304, 
			0.06597714816892115, 
			0.04570148754185952, 
			0.03481692141574398, 
			0.031526589902698625, 
			0.034366108876133734, 
			0.039790958700903614, 
			0.0497387401892204, 
			0.05774798421066304, 
			0.06577077679446966, 
			0.06995177190424032, 
			0.0723116720041985, 
			0.07032295370587209, 
			0.06634714801841467, 
			0.05836103955225158, 
			0.050060312429803536, 
			0.03971274921730002, 
			0.034238559846034, 
			0.03179906322573478, 
			0.03445014878402316, 
			0.04081203536691287, 
			0.05313868175465151, 
			0.06471665140563532, 
			0.07717810974583045, 
			0.0872280959001611, 
			0.09634938237822349, 
			0.10303978224833461, 
			0.10849180525109095, 
			0.1119566082195955, 
			0.11435416491807981, 
			0.11518843658605549, 
			0.11528291209215136, 
			0.11418666537444525, 
			0.11293123014368885, 
			0.11103881888608569, 
			0.11016550765202109, 
			0.10961915844111356, 
			0.11183289499416141, 
			0.114402332166429, 
			0.11801709552708535, 
			0.1211994854203444, 
			0.12441807978882466, 
			0.1269567496128216, 
			0.12920240432132507, 
			0.13082379541481154, 
			0.1321173142873913, 
			0.1329102816436827, 
			0.1334275688050775, 
			0.13354635491037092, 
			0.1334702093969833, 
			0.13308095820840238, 
			0.13264211727376315, 
			0.13202597180982106, 
			0.13166974722084984, 
			0.1313913099296577, 
			0.13185017928624004, 
			0.13240595796326607, 
			0.1332492913241487, 
			0.1339754875793302, 
			0.13471093420812846, 
			0.13524769380306162, 
			0.1356894687057335, 
			0.13592515282010614, 
			0.13603683427673172, 
			0.1359467180277636, 
			0.13572598338582817, 
			0.13529747800940695, 
			0.13474871128968405, 
			0.1339906785898666, 
			0.13318071964293465, 
			0.1322200956229625, 
			0.13142427532048834, 
			0.1306640974578957, 
			0.13046117292346887, 
			0.130341845868326, 
			0.13046119287418373, 
			0.13048739765250345, 
			0.13051259144105448, 
			0.13032617392958137, 
			0.13000158042347185, 
			0.12937196784253907, 
			0.12850413770007932, 
			0.12721396360906345, 
			0.12559043178546106, 
			0.12339133319418556, 
			0.12080308453477732, 
			0.11751174773526082, 
			0.11397887860988713, 
			0.10984829539492855, 
			0.10620551487835592, 
			0.10261895323041752, 
			0.101079803479358, 
			0.0998796706059779, 
			0.0996578188268929, 
			0.09908447026041275, 
			0.09852482368135905, 
			0.09704064983982158, 
			0.0949454942221767, 
			0.09144558811709294, 
			0.08693544210151162, 
			0.08060111191062912, 
			0.0733073268391434, 
			0.06441020022271278, 
			0.056551247699791016, 
			0.05066919602451682, 
			0.05544908181393439, 
			0.07700453483775314, 
			0.10239371576544942, 
			0.1312899007137118, 
			0.13989379358440066, 
			0.14155553197913873, 
			0.12668443431296916, 
			0.10958393660094153, 
			0.08607047809591609, 
			0.0658615142733579, 
			0.04596971485476449, 
			0.031765566037025475, 
			0.02095574043257708, 
			0.01592255162992688, 
			0.014600807896253032, 
			0.01300305789960254, 
			0.012388720252471386, 
			0.011303594628148205, 
			0.012923630310459936, 
			0.017819162289985, 
			0.02083913903465981, 
			0.02413461215860035, 
			0.02119549016298387, 
			0.020316956409935118, 
			0.02182117626670806, 
			0.025934760531051905, 
			0.032279538211179806, 
			0.037909836463307305, 
			0.043382590894427, 
			0.047508869937132735, 
			0.0509504126346238, 
			0.05316994753239758, 
			0.05473257196647877, 
			0.05530867871418612, 
			0.05542046937687972, 
			0.05477917019596011, 
			0.054041027963588825, 
			0.05290186983562863, 
			0.05240822345334327, 
			0.052117887137115605, 
			0.05355870599413851, 
			0.05521254041184574, 
			0.05751226879809267, 
			0.059533102146772356, 
			0.06157128923623491, 
			0.06318238180648693, 
			0.06461047001946876, 
			0.06565254266287693, 
			0.06649451666695828, 
			0.0670334393287089, 
			0.06740862708886684, 
			0.0675499670231631, 
			0.06757985571596567, 
			0.06743297119608059, 
			0.06726093105566025, 
			0.06699350349677095, 
			0.06687386892413108, 
			0.06680022123196043, 
			0.06713232275133713, 
			0.06751602947992222, 
			0.06805476215626913, 
			0.06852984997992981, 
			0.0690114293214417, 
			0.0693930823517505, 
			0.06973251183656252, 
			0.06998065138333534, 
			0.0701816085826212, 
			0.07031039837099232, 
			0.07040020974429052, 
			0.07043405935167871, 
			0.07044120423462474, 
			0.07040587204456664, 
			0.07036440648380547, 
			0.07029989035864302, 
			0.07027080708824641, 
			0.07025272192124668, 
			0.07033248915654405, 
			0.07042483564399522, 
			0.07055482371710381, 
			0.07066961859871237, 
			0.07078617169142638, 
			0.07087870849525282, 
			0.07096116271369395, 
			0.07102165958858954, 
			0.07107084153607929, 
			0.07110271095102044, 
			0.07112523946334681, 
			0.07113441521233922, 
			0.07113717309896572, 
			0.07112983041748558, 
			0.07112084075722105, 
			0.07110624611966272, 
			0.07109946459887366, 
			0.07109469788397317, 
			0.07111163164648221, 
			0.07113006282491968, 
			0.07115467823512853, 
			0.07117143180523541, 
			0.07118076442276913, 
			0.07117075675411375, 
			0.0711337753184727, 
			0.07104820546168442, 
			0.07088263841781466, 
			0.07057637441499359, 
			0.0700255297364682, 
			0.06904328010610722, 
			0.06730110910195349, 
			0.06421643096626234, 
			0.058760314510795976, 
			0.04911295584877439, 
			0.032058044378659376, 
			0.0
	};
	
	double[] RightMotorSpeeds = {
			0.0, 
			0.22301256550612364, 
			0.34809973242701264, 
			0.4188669461676504, 
			0.45890318139326086, 
			0.4815535627786726, 
			0.4943682121186873, 
			0.5016182520042375, 
			0.5057204526838589, 
			0.5080415154407223, 
			0.5093553628532613, 
			0.5100987738929683, 
			0.5105200695500053, 
			0.510757754972498, 
			0.5108922159641073, 
			0.5109652745954397, 
			0.5110040460196521, 
			0.5110174082002895, 
			0.511016914126402, 
			0.5109991578668283, 
			0.5109776863993523, 
			0.5109518379644907, 
			0.5109290506934344, 
			0.5109075321085367, 
			0.5108909816213844, 
			0.5108769091017539, 
			0.5108676812630382, 
			0.5108602359340445, 
			0.5108570376592011, 
			0.5108537566046533, 
			0.510853804946121, 
			0.5108498883904388, 
			0.5108469947309691, 
			0.51083173537643, 
			0.5108116862999567, 
			0.5107628982415566, 
			0.510700215883422, 
			0.5105887709365533, 
			0.5104760079095498, 
			0.5103526312893092, 
			0.5102472306549741, 
			0.5101500493641977, 
			0.5100758432234109, 
			0.510013346327924, 
			0.5099722075923514, 
			0.509939338922375, 
			0.5099249075539767, 
			0.5099108698717651, 
			0.5099113704233279, 
			0.5098963057235502, 
			0.5098863806312579, 
			0.5098263989679125, 
			0.509747729604706, 
			0.5095513179184586, 
			0.5092983046870574, 
			0.5088437023606591, 
			0.5083834849049139, 
			0.5078787743328854, 
			0.5074482181174622, 
			0.5070514828222147, 
			0.5067502807392744, 
			0.5064983035157244, 
			0.5063363848073545, 
			0.5062109688360639, 
			0.506165543892328, 
			0.506126454679639, 
			0.5061545849129672, 
			0.5061266042078937, 
			0.5061317371531379, 
			0.5059413215392554, 
			0.5056889403238471, 
			0.5049567010347863, 
			0.5039990481118871, 
			0.5021899260509647, 
			0.5003539567426654, 
			0.49831924022749935, 
			0.4965950776116366, 
			0.49501102300408106, 
			0.49384097983153874, 
			0.49289364500358246, 
			0.4923597076639318, 
			0.49202192723036636, 
			0.4920927153550137, 
			0.4922762442434136, 
			0.4928779456488425, 
			0.4933942854194081, 
			0.49427654053451386, 
			0.49454396490752267, 
			0.49484544540840947, 
			0.49324364448058555, 
			0.49086063398848756, 
			0.48450763358284776, 
			0.47798137767020316, 
			0.4703235691122386, 
			0.4640755462606311, 
			0.45843598271342945, 
			0.45494584847976266, 
			0.4527967950602333, 
			0.4532363519115326, 
			0.4554301285081487, 
			0.4609247623469869, 
			0.4686326500102253, 
			0.4808788099977589, 
			0.4955687489681152, 
			0.5160554232562913, 
			0.5370721661213149, 
			0.5625995026669097, 
			0.5793086671866885, 
			0.5922711203182711, 
			0.5772933408702723, 
			0.5574480541357131, 
			0.5267124885980553, 
			0.5000457079483852, 
			0.47340291279398833, 
			0.4533099215327221, 
			0.43615245976931705, 
			0.4245363641946671, 
			0.41576777232072565, 
			0.41110308696470205, 
			0.40865692621943805, 
			0.40933444102788324, 
			0.4115843176652665, 
			0.4162820087638209, 
			0.42155613810075493, 
			0.4283148145796849, 
			0.43359105639602624, 
			0.4385776480729814, 
			0.4389890602299317, 
			0.43870291271063594, 
			0.43648756789688303, 
			0.43461457052116115, 
			0.4323149656127562, 
			0.4306843631722025, 
			0.429158715723469, 
			0.4282727977102302, 
			0.42763506421517994, 
			0.4275487239794722, 
			0.4277385368757642, 
			0.42842627959905083, 
			0.429369488253189, 
			0.4307681693539106, 
			0.4322929617292878, 
			0.4341318664685807, 
			0.43570235346253466, 
			0.43721741426595406, 
			0.43776231033662477, 
			0.43809165647999804, 
			0.43792901703078096, 
			0.43776138240527684, 
			0.4374310981712015, 
			0.437194318299117, 
			0.4369370425684613, 
			0.43679216413194527, 
			0.4366765391139212, 
			0.4366678552518423, 
			0.43670151557986825, 
			0.43683513647739813, 
			0.4370034886295652, 
			0.4372601606621635, 
			0.4375090885997134, 
			0.4378056701594678, 
			0.4379794750404898, 
			0.43810638030060484, 
			0.4379234065382209, 
			0.4376894735722631, 
			0.4373269315045354, 
			0.4369980142216918, 
			0.43664746063398885, 
			0.4363570188037921, 
			0.4360761867838681, 
			0.4358464513471668, 
			0.4356194464069857, 
			0.4354219910776826, 
			0.43520012494594146, 
			0.43498038034644526, 
			0.4346880752631012, 
			0.4343597653900321, 
			0.4338756959709424, 
			0.43329774409537974, 
			0.43242986337260386, 
			0.43140876398946215, 
			0.429964987783998, 
			0.4285235990742519, 
			0.42701442029292946, 
			0.42568069515236207, 
			0.42443103877279836, 
			0.42337501779158326, 
			0.4224001281347439, 
			0.4215615417888389, 
			0.42072830647350556, 
			0.4199506747595776, 
			0.41905727749428684, 
			0.4181253204440024, 
			0.41689241158309825, 
			0.4154944341882878, 
			0.4134859780635078, 
			0.4111178239875722, 
			0.40761794998416184, 
			0.40353734401202723, 
			0.3977244938180143, 
			0.39194426730778037, 
			0.3858721021467506, 
			0.38059554794395273, 
			0.37573463691174513, 
			0.37186541465412304, 
			0.3685481475596514, 
			0.36619741194366207, 
			0.364347485058416, 
			0.3635424515608322, 
			0.36324616454080194, 
			0.3644243131687805, 
			0.3662792845550222, 
			0.3705397066579116, 
			0.37543896388436404, 
			0.38365540317109087, 
			0.3898360263632416, 
			0.3971900782342076, 
			0.3902267401078502, 
			0.38066453460404664, 
			0.35985346578226046, 
			0.33908274326136845, 
			0.31306012442891756, 
			0.2905057276940122, 
			0.2677387312200602, 
			0.2502755806950799, 
			0.23511903534537323, 
			0.22552961416527348, 
			0.21890382923796872, 
			0.2174651856256089, 
			0.21856487751915651, 
			0.22415720036858738, 
			0.23051224060107428, 
			0.23959514253377462, 
			0.24480631776932404, 
			0.2487913886533541, 
			0.24121195431772188, 
			0.2319086665646341, 
			0.21790753060843326, 
			0.2054961112613188, 
			0.19272041214287366, 
			0.18265450284730805, 
			0.17368462323932135, 
			0.16722159200273937, 
			0.1620327252966231, 
			0.1588381847158368, 
			0.1567161331556911, 
			0.15616031130212873, 
			0.15636027399862473, 
			0.15777387574798712, 
			0.1593877317757643, 
			0.1616846374706748, 
			0.16302320006261256, 
			0.1640812721354609, 
			0.16242158970326598, 
			0.1603905309720855, 
			0.1572850572168402, 
			0.15455123864896783, 
			0.15172257947522977, 
			0.14950669379134332, 
			0.1475269966768851, 
			0.14611673001369865, 
			0.1449905479329288, 
			0.1443258032352751, 
			0.1439062195449971, 
			0.143858835441384, 
			0.14398578774238052, 
			0.14440834797998997, 
			0.14486645497832937, 
			0.14549013906667846, 
			0.14584422479626818, 
			0.14611288855300453, 
			0.14563768018780054, 
			0.14506052658308358, 
			0.14418992672343192, 
			0.14342955413908198, 
			0.14265010509390189, 
			0.1420568593470663, 
			0.1415411261269682, 
			0.14120977701103507, 
			0.1409728231496497, 
			0.1409019023378145, 
			0.14091387629800894, 
			0.1410780644908546, 
			0.14129049363979002, 
			0.14163344242918402, 
			0.1419311381418665, 
			0.14228593355686744, 
			0.1423713987553798, 
			0.1423509844226203, 
			0.1417152040301226, 
			0.14102223318942092, 
			0.1401257163990861, 
			0.13938669067195208, 
			0.13869176834978375, 
			0.1382450215370375, 
			0.137935337964828, 
			0.13790603689384423, 
			0.1380416681757995, 
			0.13849335769105753, 
			0.13911048373331414, 
			0.14009695641396486, 
			0.14118999208042043, 
			0.14267258840642602, 
			0.1440024888419476, 
			0.1455516625772288, 
			0.14618929365933836, 
			0.1464949973167184, 
			0.14453276995838032, 
			0.14237135090587208, 
			0.13941603941752784, 
			0.1371312587242584, 
			0.13508746241295982, 
			0.134236428852928, 
			0.13418277878230583, 
			0.13574877207773534, 
			0.13856305611560282, 
			0.14368715737368787, 
			0.15068119779751044, 
			0.16120591289636854, 
			0.17437972159174758, 
			0.19274964863614383, 
			0.2136596380662535, 
			0.24030574421129094, 
			0.26406913777442137, 
			0.2878530266529782, 
			0.2897072245515258, 
			0.28490232354584655, 
			0.2644094261651408, 
			0.2428848609561698, 
			0.21594616599767652, 
			0.19307501293951795, 
			0.17088166781761593, 
			0.15429051957509324, 
			0.14037736024524666, 
			0.13166783115903302, 
			0.12571967284570118, 
			0.12414642748787963, 
			0.12462846454538976, 
			0.1285623127170803, 
			0.13293260016851108, 
			0.13917004098151858, 
			0.1423896972341568, 
			0.14464486594460915, 
			0.1388746545514562, 
			0.1321005249887719, 
			0.1223859676406849, 
			0.11391850700129318, 
			0.10536904351449357, 
			0.09869677058776792, 
			0.09281221494794425, 
			0.08859512197813872, 
			0.08522927717402921, 
			0.08316192584872519, 
			0.08179239128381084, 
			0.08142935658766207, 
			0.08155117425356316, 
			0.08244551220169957, 
			0.08346621200706839, 
			0.0849171066619342, 
			0.08575956733810666, 
			0.0864218857404151, 
			0.08537172630636661, 
			0.08408702114663513, 
			0.08212813162716208, 
			0.08040221525265531, 
			0.07861743539399596, 
			0.07721569104397227, 
			0.07596171852837072, 
			0.07506171172869955, 
			0.07433843502925971, 
			0.07389915556054696, 
			0.07361175570115981, 
			0.07355020295388254, 
			0.07359791987178135, 
			0.07382303478733612, 
			0.07407852978146535, 
			0.07443539036335359, 
			0.07465306244694345, 
			0.07482962528578556, 
			0.07460418987891283, 
			0.07432013464481926, 
			0.0738724868545631, 
			0.07347553606666332, 
			0.07306058193710527, 
			0.07273361703445375, 
			0.07243941034959492, 
			0.07222798879405326, 
			0.07205757166281515, 
			0.07195431635555544, 
			0.07188691501375767, 
			0.07187336037830006, 
			0.07188588887866211, 
			0.07194099155769865, 
			0.0720034884253217, 
			0.07209048370926735, 
			0.07214414881926035, 
			0.07218797768208299, 
			0.07213483119609933, 
			0.07206730032970188, 
			0.07195994654082784, 
			0.07186453001244163, 
			0.0717644673551038, 
			0.07168543857639383, 
			0.0716141274388776, 
			0.07156265007664843, 
			0.07152093740492507, 
			0.07149527281908558, 
			0.07147813792401977, 
			0.07147377814400262, 
			0.07147559677144731, 
			0.07148740972551636, 
			0.07150096920082118, 
			0.07152015200769873, 
			0.07153146906185985, 
			0.07154010064137178, 
			0.07152558748998245, 
			0.07150625821958263, 
			0.07147512461302316, 
			0.07144207011156231, 
			0.07139982001720149, 
			0.07134804415816015, 
			0.07127290401885325, 
			0.07115787000027014, 
			0.07096695974431212, 
			0.07064159695170706, 
			0.07007481959086412, 
			0.0690806534384976, 
			0.0673286374148656, 
			0.06423648419016868, 
			0.058774086820027806, 
			0.04912166851633191, 
			0.03206223428595824, 
			0.0
	};

	public int nSteps() {
		return LeftMotorSpeeds.length;
	}
	
	public double LeftSpeed(int i) {
		return LeftMotorSpeeds[i];
	}
	public double RightSpeed(int i) {
		return RightMotorSpeeds[i];
	}

}
