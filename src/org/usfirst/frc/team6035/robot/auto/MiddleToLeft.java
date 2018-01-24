package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class MiddleToLeft extends AutoDirection{
	
	public MiddleToLeft() {
		super(Config.MIDDLE_TO_LEFT_COMPENSATION);	
		}

	double[] LeftMotorSpeeds = {
			0.0, 
			0.0686503138572341, 
			0.10703417682965996, 
			0.12874769723273582, 
			0.14102946129939334, 
			0.14797497211893468, 
			0.15190036832759962, 
			0.1541167693955474, 
			0.15536443585091902, 
			0.1560637738674884, 
			0.1564501693496621, 
			0.1566600148571688, 
			0.15676658621596284, 
			0.15681769606276993, 
			0.15683425724695466, 
			0.15684001675348913, 
			0.15683756814834562, 
			0.15684742049331118, 
			0.1568547965408449, 
			0.15686583591334818, 
			0.15686921995957862, 
			0.15686905054855957, 
			0.15685717463309806, 
			0.1568378037477633, 
			0.15680321047189738, 
			0.1567591619048363, 
			0.15669630360509806, 
			0.15662512470844042, 
			0.1565336551464211, 
			0.15644367852673174, 
			0.156340402615257, 
			0.1562676189134398, 
			0.15620294972913146, 
			0.15621645842756096, 
			0.15623357568715432, 
			0.15627490534439017, 
			0.1562884319902243, 
			0.1562899239955215, 
			0.15624377521871488, 
			0.15616730616717897, 
			0.15602800581048965, 
			0.15584982244775028, 
			0.1555940977846631, 
			0.15530414799849054, 
			0.15493079921928782, 
			0.15456365158394478, 
			0.1541420426283032, 
			0.15384579384043814, 
			0.15358311815918646, 
			0.1536414869105576, 
			0.1537149052251564, 
			0.15388789653443394, 
			0.15394716241462233, 
			0.15395747247446656, 
			0.15377308466618592, 
			0.15346522796097395, 
			0.15290116532926157, 
			0.15217940346932574, 
			0.15114242967904762, 
			0.1499682348241751, 
			0.14845674931718442, 
			0.14697547708424563, 
			0.1452776366847226, 
			0.14409898949057826, 
			0.14306460093740475, 
			0.14334704979535937, 
			0.14369486340301604, 
			0.1444520959969529, 
			0.14474948071724236, 
			0.14485339548761006, 
			0.1441747062006719, 
			0.14300982899954764, 
			0.14082876579272072, 
			0.13804478224863764, 
			0.13403732870637824, 
			0.12955155444737934, 
			0.12380954993145636, 
			0.11832955497334026, 
			0.11215549416882109, 
			0.10825537022089235, 
			0.10513038758061297, 
			0.10734861265651693, 
			0.10992400804341798, 
			0.11415465590501525, 
			0.11672711679608756, 
			0.11872085767474012, 
			0.11806671447589401, 
			0.11604005447166858, 
			0.11098589120286433, 
			0.1047201308298592, 
			0.09553143129010763, 
			0.08652606775954695, 
			0.07574960260732501, 
			0.06870947154428822, 
			0.06283831158262451, 
			0.06665970088085671, 
			0.07513538011938839, 
			0.09795496586347437, 
			0.12137018778624138, 
			0.14717358070218103, 
			0.16891580812500417, 
			0.18857235218963092, 
			0.2038476732468749, 
			0.21658159074725075, 
			0.22600497740116499, 
			0.23353633602313492, 
			0.238859565910353, 
			0.2430824646683422, 
			0.245969720846634, 
			0.2485826916641083, 
			0.2506261214529116, 
			0.2534021556529391, 
			0.2563385753109412, 
			0.2610194393895332, 
			0.26559380477611866, 
			0.27048334653047096, 
			0.2746628340272434, 
			0.2784920240653554, 
			0.2815369780977924, 
			0.28412431331404897, 
			0.2860861027906284, 
			0.28768509747055754, 
			0.2888481528526603, 
			0.28978922879029134, 
			0.29045715705999475, 
			0.2910623947934881, 
			0.29154425974984777, 
			0.29216784227153136, 
			0.29281829055635133, 
			0.29383182063035906, 
			0.2948230196279031, 
			0.2958853095572322, 
			0.29679606854414253, 
			0.297632255943307, 
			0.29829587902040994, 
			0.29885583717783615, 
			0.29927311513733107, 
			0.2996016470639408, 
			0.2998247236484867, 
			0.2999832010864931, 
			0.3000669380959722, 
			0.3001120996305679, 
			0.3001098904641698, 
			0.30010388180075553, 
			0.30008269497996315, 
			0.30010397953426265, 
			0.30012235370466145, 
			0.30015409284161965, 
			0.30017013829884004, 
			0.3001763600830113, 
			0.3001583778424192, 
			0.3001145657864478, 
			0.30003908296919846, 
			0.299920611897991, 
			0.2997588446428278, 
			0.29952885115648253, 
			0.29923698934215337, 
			0.2988393370648252, 
			0.29835701799664827, 
			0.29772266371688805, 
			0.29699792883555587, 
			0.296101073274698, 
			0.295212733068103, 
			0.29430967417848214, 
			0.2934885442920571, 
			0.29269873212546027, 
			0.29197945915305235, 
			0.29125602094005704, 
			0.2905477611311741, 
			0.28975296553073027, 
			0.2888958370470177, 
			0.2878277164634646, 
			0.28659983849950266, 
			0.2849786017301301, 
			0.28308132542027575, 
			0.2805364068424804, 
			0.27763903979711446, 
			0.27387606725754715, 
			0.2701585154935388, 
			0.26633277649987525, 
			0.2629448552962727, 
			0.2597630791646919, 
			0.25708026874638196, 
			0.2545938294363156, 
			0.25254763380330136, 
			0.25057293500603234, 
			0.2490444728425924, 
			0.24745193302399313, 
			0.2464866589905888, 
			0.2452112050758975, 
			0.24479382721567672, 
			0.2428594870247247, 
			0.24108796428710141, 
			0.23309315665757713, 
			0.22457410118758717, 
			0.2118726937645949, 
			0.2000538092419805, 
			0.1864590077819233, 
			0.1750647757203248, 
			0.16387018091992125, 
			0.15573161381407277, 
			0.14898271200340857, 
			0.14567468792524316, 
			0.14414929493656137, 
			0.14610044259165916, 
			0.149235143553592, 
			0.15513692557458547, 
			0.1593863879902459, 
			0.1636733054735139, 
			0.15957978255574234, 
			0.15391319791877853, 
			0.1434437218334994, 
			0.13361617940133966, 
			0.12251389463651848, 
			0.11348041567145906, 
			0.1050076924527739, 
			0.09895280147184934, 
			0.09404612792447319, 
			0.09137744771694913, 
			0.08977807012794121, 
			0.09003396582044003, 
			0.09075147618645693, 
			0.09262754177217446, 
			0.0934744533259205, 
			0.09415994572096018, 
			0.09135081293365489, 
			0.08811708066084581, 
			0.08341582191923412, 
			0.07926840726211212, 
			0.07499824173111665, 
			0.07165609397773048, 
			0.06868891290718573, 
			0.06662110348613479, 
			0.06500641380121594, 
			0.06414250855578693, 
			0.06364017738699754, 
			0.06372023350365738, 
			0.06393811080374012, 
			0.06449946478553703, 
			0.06473396761369651, 
			0.06491444606004756, 
			0.06406209368096759, 
			0.06310978370636539, 
			0.06176212893708325, 
			0.060613726621562634, 
			0.05946597557525245, 
			0.058628368705044356, 
			0.05793347658310816, 
			0.05754968817170236, 
			0.05733209478660315, 
			0.057398919911591906, 
			0.057599667554946145, 
			0.058045852122276434, 
			0.058521109561139206, 
			0.059146756924525146, 
			0.05954678077484822, 
			0.05989551202237411, 
			0.05961677570273775, 
			0.05929666388366665, 
			0.058764132979154934, 
			0.05841300144769015, 
			0.05811921301327605, 
			0.05812749544058475, 
			0.058314453067552854, 
			0.05887483729428328, 
			0.05965991836785802, 
			0.06088068095201828, 
			0.06229610483853162, 
			0.06416457070669342, 
			0.06601121910144045, 
			0.0681500666359479, 
			0.06964305366398402, 
			0.07096212953485276, 
			0.0706159365707469, 
			0.07017989280101658, 
			0.0692160660030322, 
			0.06881096000029248, 
			0.06863100842486979, 
			0.0694010443988511, 
			0.07075763357189103, 
			0.0733379711397145, 
			0.07664438100999213, 
			0.08140705837240848, 
			0.08673536653036404, 
			0.0935239003271798, 
			0.09995904992312693, 
			0.10710199921349957, 
			0.11140902078584067, 
			0.11449813431746243, 
			0.11093496186088717, 
			0.10631944283325596, 
			0.09920928709499097, 
			0.09296346683794003, 
			0.08657619443765088, 
			0.08164723553745272, 
			0.07732607080481126, 
			0.0743609296339818, 
			0.07207836897190428, 
			0.0708882644756877, 
			0.07022416522572386, 
			0.07038561390248435, 
			0.07074974483293242, 
			0.07159231676978488, 
			0.07200320049786157, 
			0.07234567616575512, 
			0.07132550102771107, 
			0.07016371145765346, 
			0.0684768499866376, 
			0.067018681099301, 
			0.0655350496328341, 
			0.06439942523217487, 
			0.06340620762351126, 
			0.06273815855908178, 
			0.06223314050604371, 
			0.06199632911163024, 
			0.06188800019628016, 
			0.06198832390231216, 
			0.062136767150648774, 
			0.062408892736429855, 
			0.06256090131857488, 
			0.0626927198565079, 
			0.062449256618119495, 
			0.06216822954769406, 
			0.06174338447494102, 
			0.06138959343319937, 
			0.06103551544366639, 
			0.060795309693357426, 
			0.0606081720616634, 
			0.06054052537122273, 
			0.06053718961280018, 
			0.06064997858930628, 
			0.06081566881974558, 
			0.061087161728429, 
			0.06136454765815742, 
			0.061707583529237754, 
			0.061934675363139256, 
			0.06213307375817913, 
			0.062020667741768266, 
			0.06188925754450769, 
			0.061655316258248105, 
			0.06151719677373305, 
			0.0614129774996434, 
			0.06147016727420549, 
			0.06162484687130102, 
			0.061984143526770695, 
			0.062466907936700775, 
			0.06319422284374934, 
			0.06402872493990672, 
			0.06512198578096431, 
			0.06619745894361564, 
			0.06744167315112773, 
			0.06830221884203581, 
			0.06906097885886334, 
			0.06883155043111178, 
			0.06855700889303126, 
			0.06797516771039966, 
			0.06774575177433946, 
			0.06766856229240778, 
			0.0681952451029876, 
			0.06910753838591507, 
			0.07081829113190793, 
			0.07302880087901237, 
			0.07623292180936658, 
			0.07989089939367496, 
			0.08463525138380883, 
			0.08933548011514285, 
			0.09477069952070714, 
			0.09862616645730876, 
			0.10206617221183334, 
			0.1013151044342104, 
			0.10033715796434803, 
			0.09800735334826306, 
			0.09712174867782926, 
			0.09682603771595902, 
			0.09902200769724742, 
			0.10276154297049038, 
			0.10973398321473904, 
			0.11859768273435586, 
			0.13127454470946837, 
			0.14528821753973659, 
			0.16292898583586665, 
			0.17911274635911228, 
			0.19650623368953896, 
			0.20554343749129173, 
			0.21070160227934495, 
			0.19877320916865, 
			0.1846811129257349, 
			0.16551583944467468, 
			0.14926854418590862, 
			0.13360324202395546, 
			0.12182033308336782, 
			0.11188564414841021, 
			0.10516694340685036, 
			0.10012074209004415, 
			0.09745951746239542, 
			0.09596282203559969, 
			0.09616218611082251, 
			0.09679804710868287, 
			0.09837782927928125, 
			0.09915763003382799, 
			0.09983083781175899, 
			0.09802661233193036, 
			0.096001759179188, 
			0.09307228152673286, 
			0.09057319781175587, 
			0.08804636304484724, 
			0.08612963573081908, 
			0.08445869196113585, 
			0.08333670406650033, 
			0.0824857655576159, 
			0.08207506953122368, 
			0.0818764561208777, 
			0.08201397238543984, 
			0.08223974156610574, 
			0.08266564719755766, 
			0.08292887248876932, 
			0.08317087322751096, 
			0.08287184266165559, 
			0.08250830414427245, 
			0.08192459347547495, 
			0.08141757405845103, 
			0.08088703747587582, 
			0.08048158479076455, 
			0.08012192244567419, 
			0.07988105915186858, 
			0.07969760272219245, 
			0.07961280330005929, 
			0.07957523940474286, 
			0.07961494800310806, 
			0.07967487146481451, 
			0.0797817061621077, 
			0.07985039260761174, 
			0.07991399868930768, 
			0.0798488821061761, 
			0.07976738229043183, 
			0.07963213830268964, 
			0.07951404342468156, 
			0.0793892729873167, 
			0.07929371387365078, 
			0.07920853838244242, 
			0.07915151219789754, 
			0.07910800572973455, 
			0.07908808019488874, 
			0.07907942642258307, 
			0.07908935356431401, 
			0.07910414309101069, 
			0.07913026437307794, 
			0.07914718743059404, 
			0.07916288173265498, 
			0.07914740694605057, 
			0.0791278952678044, 
			0.07909527846417419, 
			0.07906672490534492, 
			0.07903646639309202, 
			0.07901320231129255, 
			0.0789923780562806, 
			0.0789782812253865, 
			0.07896737267127794, 
			0.07896203529703792, 
			0.07895928783208012, 
			0.07896077673784516, 
			0.07896314865694165, 
			0.07896767645165535, 
			0.07896919298984609, 
			0.07896881929246846, 
			0.07895838813875009, 
			0.07894192152152588, 
			0.07891342809803606, 
			0.07886994132255601, 
			0.0787979799987246, 
			0.07867798655813839, 
			0.07847095926658312, 
			0.07811063417334223, 
			0.07747761335172598, 
			0.07636252677001129, 
			0.07439414871255534, 
			0.07091731899981908, 
			0.06477341876495425, 
			0.05391506319840178, 
			0.03472306772159587, 
			0.0	
	};
	
	double[] RightMotorSpeeds= {
			0.0, 
			0.06865647227295753, 
			0.10704700647432663, 
			0.1287679453623771, 
			0.14105885572119817, 
			0.14801512583473667, 
			0.15195454388850546, 
			0.1541875949759969, 
			0.155457168994487, 
			0.15618193957056087, 
			0.15660122310697078, 
			0.15684718603221504, 
			0.15699848758172563, 
			0.1570932714165419, 
			0.15715925376632384, 
			0.15720019952997374, 
			0.15722907934145217, 
			0.15723418969772357, 
			0.15723528799240327, 
			0.1572290528462666, 
			0.1572283967185311, 
			0.15723012060360708, 
			0.15724288843511663, 
			0.15726277936037855, 
			0.15729768596164712, 
			0.1573419371078033, 
			0.15740494295613253, 
			0.1574762499910557, 
			0.1575678504372825, 
			0.1576579794464589, 
			0.15776144063190625, 
			0.15783445623595008, 
			0.15789940421799706, 
			0.1578862257240965, 
			0.15786946456227366, 
			0.15782851610474943, 
			0.1578153841110786, 
			0.1578143146051055, 
			0.15786092305705493, 
			0.1579379232791258, 
			0.15807785758588497, 
			0.15825683924693396, 
			0.158513585329771, 
			0.15880488333419437, 
			0.15917999924538068, 
			0.15954949133060253, 
			0.1599741232729996, 
			0.16027425508948834, 
			0.16054164647340194, 
			0.16048888465475813, 
			0.1604215182342261, 
			0.16025500431536488, 
			0.16020243935531145, 
			0.16019929574119438, 
			0.16039147127239334, 
			0.1607083159964491, 
			0.16128309297585694, 
			0.162018332236189, 
			0.1630725330541482, 
			0.16426944634159538, 
			0.16581068385567127, 
			0.16733139670080316, 
			0.16908005262116751, 
			0.17032392203337088, 
			0.17143745726003823, 
			0.17124903589089674, 
			0.17100262764374413, 
			0.17035383370568305, 
			0.17016851917782566, 
			0.1701843273050018, 
			0.1709929530482051, 
			0.17230758628799095, 
			0.17466689989290138, 
			0.17767475247035117, 
			0.18196787397117564, 
			0.18682970054596673, 
			0.19306316783618244, 
			0.19919312792204152, 
			0.20620223793826753, 
			0.21117025449078758, 
			0.21558549798590526, 
			0.2148907293755585, 
			0.21394702728510304, 
			0.21144626610446315, 
			0.21064245194422998, 
			0.21051363315986826, 
			0.21316035259890978, 
			0.21744416139187442, 
			0.22513466571611693, 
			0.23464810973625255, 
			0.24789606464958194, 
			0.26213068279174034, 
			0.279576125034283, 
			0.29519502692113836, 
			0.31173437969863155, 
			0.32098834539227744, 
			0.32757773062123136, 
			0.32146531670747613, 
			0.3145910903536209, 
			0.3046398626858401, 
			0.2970159983744013, 
			0.289803689228528, 
			0.2850528777454099, 
			0.2812969694999945, 
			0.279417468593206, 
			0.278424642086723, 
			0.27884065885493137, 
			0.2799408951775106, 
			0.2821424829599482, 
			0.28469181172086044, 
			0.28795746148443, 
			0.2908224896761755, 
			0.29368705025765146, 
			0.29493731915616106, 
			0.29586886705859655, 
			0.2959950467314928, 
			0.29611698097981753, 
			0.2959625827420921, 
			0.29594929938178016, 
			0.29589116785026076, 
			0.29601231712178244, 
			0.29618236377047413, 
			0.29654032552494586, 
			0.29697971873299867, 
			0.297603600823104, 
			0.29828278832213956, 
			0.29909926675723064, 
			0.29983542063885593, 
			0.3005670148092846, 
			0.30095240465865813, 
			0.3012478801042027, 
			0.30134581040795455, 
			0.30141733852754127, 
			0.30140540624971923, 
			0.3014035847551021, 
			0.30137292551338013, 
			0.30136327617404585, 
			0.3013461532732663, 
			0.30135003811245437, 
			0.30135119210124506, 
			0.3013684227391562, 
			0.3013752826923298, 
			0.3013865977844011, 
			0.30136367608424064, 
			0.3013238630481848, 
			0.3012123216528746, 
			0.3010827410164957, 
			0.30091726247283634, 
			0.3007447787293528, 
			0.3005501456101764, 
			0.30034056520111385, 
			0.3001006791369655, 
			0.29982350220590315, 
			0.2994944691841826, 
			0.299096878016631, 
			0.29862018628210746, 
			0.29804260170551045, 
			0.2973677265525124, 
			0.2965789508565163, 
			0.29571686683962917, 
			0.29478512134442353, 
			0.2938831139462565, 
			0.2929960310811549, 
			0.29215434409704816, 
			0.2913121643768293, 
			0.29045978517444826, 
			0.289531198902108, 
			0.28849752915398924, 
			0.28727309637138426, 
			0.28582229816276955, 
			0.28403581447574267, 
			0.2818922126532265, 
			0.279265470455481, 
			0.27620613488389245, 
			0.2726116493785743, 
			0.26873490370973674, 
			0.26455915512720096, 
			0.26067415723652004, 
			0.25687992765160045, 
			0.25336740760113474, 
			0.24981415085498995, 
			0.2462086241650177, 
			0.24215746247487333, 
			0.23754811523480562, 
			0.23187841892938837, 
			0.22497832985221233, 
			0.21615143985306023, 
			0.20526130286594008, 
			0.19136233294043187, 
			0.1747368803045592, 
			0.15436972292617437, 
			0.13231477626360064, 
			0.10817408950546932, 
			0.08889783087627581, 
			0.07185163913336641, 
			0.06120565824096569, 
			0.05307655526980679, 
			0.04974027403237931, 
			0.04729717412185534, 
			0.04708609691855605, 
			0.04598888430724934, 
			0.04509829215833412, 
			0.04214287535303649, 
			0.038464679395345217, 
			0.032450838394529904, 
			0.026595796500183604, 
			0.020224380768412657, 
			0.019233686472136607, 
			0.02341266814336174, 
			0.022377635465222916, 
			0.021468170631589744, 
			0.017253680818554915, 
			0.01554821618198102, 
			0.015977373476064604, 
			0.018213530791042768, 
			0.022205798597858428, 
			0.025227975616904607, 
			0.0279736036605985, 
			0.029032025366687836, 
			0.029336312505224622, 
			0.027974427627435433, 
			0.02623105181364247, 
			0.023367792568793323, 
			0.021524172834964522, 
			0.019854517026326478, 
			0.021688670323967856, 
			0.02404386093504347, 
			0.0279660725443099, 
			0.03146104351931554, 
			0.0351856576908492, 
			0.0380857670920839, 
			0.04068992128483272, 
			0.042462412611117877, 
			0.04382871647247875, 
			0.04448044252704106, 
			0.04479100032914385, 
			0.04453190909675296, 
			0.04413634680242698, 
			0.04339582531807459, 
			0.04297433627563659, 
			0.04260471128800974, 
			0.043266604568856185, 
			0.04404450812446877, 
			0.04523526228388017, 
			0.046250525915587024, 
			0.04728558022494858, 
			0.04803087503414538, 
			0.04864917772361158, 
			0.048970094610075204, 
			0.049134362595693676, 
			0.04902166204238015, 
			0.048779213772298366, 
			0.04829396356848502, 
			0.04777989023704988, 
			0.04711516268988867, 
			0.04667450328035157, 
			0.0462849085229199, 
			0.04652281285427291, 
			0.046805910473206855, 
			0.047305585433790556, 
			0.04762936710864733, 
			0.04790067239012618, 
			0.04787484032497561, 
			0.047674475801930113, 
			0.047104626764128577, 
			0.04631356791515112, 
			0.04509032954882424, 
			0.043676044205680116, 
			0.0418127871645131, 
			0.03997623979347617, 
			0.037853257914895896, 
			0.0363833104436105, 
			0.03509495251006075, 
			0.03548067587984503, 
			0.035963440618052435, 
			0.036983005880486634, 
			0.03745496727928983, 
			0.037720853021874924, 
			0.03706806152293107, 
			0.03588398646226225, 
			0.03357014895548842, 
			0.030693548332863384, 
			0.026640112501451468, 
			0.022505716012863296, 
			0.017746824134424, 
			0.014795777841316993, 
			0.013662994059059954, 
			0.013832847681047786, 
			0.015712000984511743, 
			0.013654973737280512, 
			0.014042409614499365, 
			0.017335071217012103, 
			0.02164154968376695, 
			0.027126168929610367, 
			0.03169949156516031, 
			0.03595569350932562, 
			0.038996419908073975, 
			0.04142612623814581, 
			0.04279405495847087, 
			0.04365566749407098, 
			0.043703637939550316, 
			0.043566045060117534, 
			0.04296552434642569, 
			0.04281819286120368, 
			0.04275111714515127, 
			0.04405621752578766, 
			0.04548489504606836, 
			0.04741672954332264, 
			0.04908625578059071, 
			0.05075136673550005, 
			0.05203726616513645, 
			0.05315618260298256, 
			0.05392787002462052, 
			0.05452088305981058, 
			0.054833203905709324, 
			0.05500983590130887, 
			0.05497316077885639, 
			0.054887733488487835, 
			0.05467908715139349, 
			0.05459339732900218, 
			0.054528895516949935, 
			0.05484044016099284, 
			0.05518401255259218, 
			0.055665116573703544, 
			0.056066282710627226, 
			0.05645971852759729, 
			0.05673094587829053, 
			0.05694209111822709, 
			0.05702714518973804, 
			0.05704233400188806, 
			0.056936289531581044, 
			0.05677280511865177, 
			0.056499301843883395, 
			0.05621586968986701, 
			0.0558631233501245, 
			0.05562272269669648, 
			0.05540827591196264, 
			0.055502203199982315, 
			0.055614419277057195, 
			0.05582841673644177, 
			0.05594619798536403, 
			0.05602874927291966, 
			0.05594799268635967, 
			0.05576623726337758, 
			0.05537525453739008, 
			0.054853950362801086, 
			0.05407987048283145, 
			0.05318752109952265, 
			0.0520242387193283, 
			0.050863543985005734, 
			0.04951960016268333, 
			0.0485430866692868, 
			0.04765764412220314, 
			0.04775139622919516, 
			0.04789406020398586, 
			0.048348444977476826, 
			0.04845861998435959, 
			0.04842063159598867, 
			0.04778140604681615, 
			0.046752895421555016, 
			0.04491937319880243, 
			0.04257311292622713, 
			0.03921942972927807, 
			0.03539493043369464, 
			0.03047547742406822, 
			0.025601704463283904, 
			0.020030896546291525, 
			0.016128613954400815, 
			0.012843439431766954, 
			0.012979442491689136, 
			0.013649834516899684, 
			0.01597186304751593, 
			0.01723915322043931, 
			0.018492153085520446, 
			0.018201861921046447, 
			0.017988971079065597, 
			0.0173755054474469, 
			0.019844685213646858, 
			0.02726818950069131, 
			0.03817661067046386, 
			0.05383904396986168, 
			0.06855827083828837, 
			0.08464442472619733, 
			0.09231183351480055, 
			0.0960412204350077, 
			0.08275334497852208, 
			0.06798683941072678, 
			0.04956447535054411, 
			0.03682060437681702, 
			0.029432873087403572, 
			0.028861506079902954, 
			0.032416364962217566, 
			0.03603133705596913, 
			0.03979281467236666, 
			0.0421553715384876, 
			0.043922699646472385, 
			0.04432033512480174, 
			0.044513849865249734, 
			0.04392185936384415, 
			0.04427757217840895, 
			0.044822075764883146, 
			0.04790317865637279, 
			0.05113170915085378, 
			0.05517019403015903, 
			0.058628432184492076, 
			0.06198067639132465, 
			0.06458272320210759, 
			0.06682910417315839, 
			0.06842826365707269, 
			0.06968773585034886, 
			0.07045300853954833, 
			0.07097693792067757, 
			0.0711473485724374, 
			0.07123119288853924, 
			0.07112136668499511, 
			0.07119196535888934, 
			0.07129163501257071, 
			0.07193867772862204, 
			0.07262438731505061, 
			0.07350094622667405, 
			0.07425874504461791, 
			0.07500334240626202, 
			0.07558539084706012, 
			0.07609251659764837, 
			0.07645510164355557, 
			0.07674233995115351, 
			0.07691688751175699, 
			0.07703651704877523, 
			0.07707425517206336, 
			0.07709199235315117, 
			0.0770642507964783, 
			0.07707891832775289, 
			0.07710045828466967, 
			0.07725214394761558, 
			0.07741365378238707, 
			0.07762151533119876, 
			0.07780171364629619, 
			0.0779794298028451, 
			0.07811862130586533, 
			0.07824019432359183, 
			0.07832723596438693, 
			0.07839630956985025, 
			0.07843832372569871, 
			0.07846715526831687, 
			0.07847625169133213, 
			0.07848052061548057, 
			0.07847379319387741, 
			0.07847729363198433, 
			0.07848244808008545, 
			0.07851910677301828, 
			0.0785581847434097, 
			0.0786085467569633, 
			0.07865226110847942, 
			0.07869542545781781, 
			0.07872929814602687, 
			0.07875893211896966, 
			0.07878023239378458, 
			0.07879718119096114, 
			0.07880758420242129, 
			0.07881471884316324, 
			0.07881697695115047, 
			0.07881774106770699, 
			0.07881536152675686, 
			0.07881437378027409, 
			0.07881211042823387, 
			0.07881422908216656, 
			0.0788118548269361, 
			0.07880314976874984, 
			0.07877714886938134, 
			0.07872309438186693, 
			0.0786175591453128, 
			0.0784236964743553, 
			0.07807355134141689, 
			0.07744929915882609, 
			0.07634087669664472, 
			0.0743781106844669, 
			0.0709055871536831, 
			0.06476534746235998, 
			0.05390996089731685, 
			0.03472063532868788, 
			0.0, 
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
