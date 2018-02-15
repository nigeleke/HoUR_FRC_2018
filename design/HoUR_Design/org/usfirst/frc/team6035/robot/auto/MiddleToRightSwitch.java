package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class MiddleToRightSwitch extends AutoDirection {

  private double[] leftMotorSpeeds = {
    0.000000, 1.829139, 2.852709, 3.431861, 3.759611, 3.945131, 4.050229, 4.109812, 4.143703, 4.163003, 4.174110, 4.180437, 4.184123, 4.186046, 4.187190, 4.187820, 4.188407, 4.188942, 4.189719, 4.190563, 4.191742, 4.192868, 4.194261, 4.195170, 4.196094, 4.195855, 4.195901, 4.195785, 4.196637, 4.197921, 4.200594, 4.203771, 4.208487, 4.213089, 4.218873, 4.222721, 4.226692, 4.225890, 4.226317, 4.226126, 4.230041, 4.235871, 4.247673, 4.261826, 4.282761, 4.303663, 4.330102, 4.348986, 4.369072, 4.369383, 4.375618, 4.380002, 4.403382, 4.436907, 4.499224, 4.575604, 4.687076, 4.804628, 4.954593, 5.077115, 5.211598, 5.254653, 5.326211, 5.387156, 5.537940, 5.734894, 6.064643, 6.448158, 6.969595, 7.461854, 8.008754, 8.287892, 8.442756, 8.058521, 7.629397, 7.078056, 6.645655, 6.257080, 6.000094, 5.805692, 5.709028, 5.651619, 5.653467, 5.655026, 5.675568, 5.647404, 5.623637, 5.582008, 5.553197, 5.523448, 5.508114, 5.496953, 5.498181, 5.502906, 5.516152, 5.527641, 5.541332, 5.543959, 5.545619, 5.541793, 5.538949, 5.534465, 5.531805, 5.529046, 5.528021, 5.527087, 5.527256, 5.526719, 5.526135, 5.523263, 5.519631, 5.514425, 5.508383, 5.501040, 5.492403, 5.482300, 5.470240, 5.456606, 5.440627, 5.423786, 5.405082, 5.387483, 5.367964, 5.347364, 5.322424, 5.293614, 5.257309, 5.214605, 5.161241, 5.100638, 5.028079, 4.952603, 4.868835, 4.794184, 4.712027, 4.627710, 4.523926, 4.403692, 4.248494, 4.064418, 3.830252, 3.565815, 3.249747, 2.942015, 2.626106, 2.439315, 2.294633, 2.248319, 2.217342, 2.231193, 2.229729, 2.236793, 2.213105, 2.186937, 2.132663, 2.093798, 2.050154, 2.068216, 2.093116, 2.148415, 2.195188, 2.247909, 2.284207, 2.316214, 2.331352, 2.341811, 2.339837, 2.340850, 2.338305, 2.352808, 2.366937, 2.387840, 2.403996, 2.420083, 2.429645, 2.436775, 2.437629, 2.436599, 2.430924, 2.426635, 2.420830, 2.421938, 2.421877, 2.423606, 2.421228, 2.417151, 2.407091, 2.394119, 2.374361, 2.352941, 2.325669, 2.302065, 2.276259, 2.263410, 2.246405, 2.230672, 2.202212, 2.166631, 2.111620, 2.046428, 1.957861, 1.864264, 1.750127, 1.652602, 1.549370, 1.502143, 1.443195, 1.396106, 1.307342, 1.204838, 1.048431, 0.891573, 0.708958, 0.620580, 0.641632, 0.687608, 0.785070, 0.679045, 0.660757, 0.745792, 0.901947, 1.122912, 1.305308, 1.476677, 1.592948, 1.692240, 1.751828, 1.819443, 1.875081, 1.976944, 2.071799, 2.178763, 2.266427, 2.348267, 2.409119, 2.460402, 2.494654, 2.522337, 2.539004, 2.556260, 2.569770, 2.593461, 2.615086, 2.639404, 2.658834, 2.676708, 2.689097, 2.698926, 2.704010, 2.707320, 2.707318, 2.707789, 2.707037, 2.710093, 2.712106, 2.714818, 2.714774, 2.713379, 2.708188, 2.700930, 2.689436, 2.676517, 2.659861, 2.644680, 2.627809, 2.617588, 2.604773, 2.592271, 2.572343, 2.547813, 2.511693, 2.468645, 2.411051, 2.348477, 2.271986, 2.201710, 2.125184, 2.076990, 2.019189, 1.964072, 1.878898, 1.775943, 1.625767, 1.450731, 1.221415, 0.989825, 0.731325, 0.570616, 0.496086, 0.397961, 0.407990, 0.489175, 0.595991, 0.751190, 0.870578, 0.984996, 1.050188, 1.103555, 1.119232, 1.147394, 1.166080, 1.242303, 1.316991, 1.412721, 1.491902, 1.569583, 1.626238, 1.674595, 1.704477, 1.727952, 1.738894, 1.751378, 1.759870, 1.782009, 1.802621, 1.827767, 1.847829, 1.866893, 1.879859, 1.890245, 1.895200, 1.898275, 1.897520, 1.897463, 1.896086, 1.899427, 1.901828, 1.905387, 1.906120, 1.905661, 1.901284, 1.894912, 1.884226, 1.872231, 1.856520, 1.842524, 1.826967, 1.818455, 1.807445, 1.796965, 1.779133, 1.756926, 1.723332, 1.683207, 1.628965, 1.570394, 1.498583, 1.433909, 1.363861, 1.323331, 1.274318, 1.229956, 1.158696, 1.075442, 0.954944, 0.827213, 0.675726, 0.575464, 0.541592, 0.592017, 0.706680, 0.651651, 0.587357, 0.448821, 0.379340, 0.371000, 0.399303, 0.463394, 0.501145, 0.539915, 0.548179, 0.572901, 0.590319, 0.666325, 0.741328, 0.837572, 0.917391, 0.995742, 1.053162, 1.102317, 1.133138, 1.157572, 1.169621, 1.183101, 1.192647, 1.215461, 1.236863, 1.262756, 1.283947, 1.304363, 1.319287, 1.331970, 1.339977, 1.346311, 1.349518, 1.353021, 1.355511, 1.361217, 1.366546, 1.372952, 1.378189, 1.383225, 1.386907, 1.390034, 1.392013, 1.393579, 1.394378, 1.395246, 1.395865, 1.397267, 1.398574, 1.400143, 1.401424, 1.402652, 1.403543, 1.404284, 1.404719, 1.405003, 1.405013, 1.404877, 1.404399, 1.403605, 1.401912, 1.398726, 1.392734, 1.381877, 1.362367, 1.327654, 1.266060, 1.157019, 0.964118, 0.623029, 0.000000
  };

  private double[] rightMotorSpeeds = {
    0.000000, 1.828817, 2.852040, 3.430814, 3.758110, 3.943118, 4.047572, 4.106446, 4.139455, 4.157856, 4.167907, 4.173346, 4.176092, 4.177557, 4.178084, 4.178132, 4.177645, 4.176838, 4.175533, 4.173934, 4.171793, 4.169467, 4.166643, 4.164033, 4.161185, 4.159264, 4.156955, 4.154663, 4.151272, 4.147192, 4.141396, 4.134583, 4.125625, 4.115955, 4.104244, 4.093424, 4.081615, 4.073656, 4.064076, 4.054562, 4.040444, 4.023410, 3.999144, 3.970525, 3.932784, 3.891885, 3.842182, 3.796073, 3.745584, 3.711547, 3.670419, 3.629452, 3.568133, 3.493600, 3.386503, 3.259231, 3.090124, 2.906011, 2.681553, 2.476004, 2.255069, 2.125072, 1.977590, 1.857566, 1.677405, 1.496734, 1.261948, 1.106737, 1.048484, 1.225794, 1.601861, 1.791431, 1.921737, 1.607502, 1.456441, 1.574689, 1.872372, 2.287893, 2.648383, 2.984762, 3.237022, 3.458123, 3.621755, 3.789919, 3.937962, 4.133759, 4.311312, 4.492410, 4.641408, 4.775108, 4.878160, 4.965027, 5.029096, 5.083057, 5.123190, 5.162371, 5.196334, 5.239166, 5.277962, 5.317495, 5.350305, 5.379918, 5.402972, 5.422427, 5.436858, 5.448747, 5.457417, 5.465202, 5.471524, 5.478796, 5.485220, 5.491554, 5.496862, 5.501431, 5.505068, 5.507594, 5.509310, 5.509325, 5.508390, 5.504536, 5.499367, 5.489766, 5.480417, 5.469950, 5.461750, 5.453682, 5.448471, 5.442521, 5.438923, 5.431338, 5.424183, 5.406016, 5.384926, 5.343056, 5.304733, 5.262967, 5.236377, 5.216028, 5.217824, 5.227224, 5.262499, 5.295214, 5.348585, 5.358395, 5.356574, 5.212106, 5.047731, 4.812090, 4.600813, 4.378609, 4.205436, 4.048534, 3.943521, 3.854298, 3.803772, 3.743315, 3.693848, 3.587356, 3.484174, 3.360018, 3.255372, 3.153673, 3.076762, 3.010214, 2.965611, 2.928892, 2.907117, 2.883647, 2.865122, 2.830535, 2.798492, 2.761666, 2.731942, 2.704165, 2.684679, 2.668851, 2.660292, 2.654143, 2.653010, 2.650544, 2.649712, 2.641983, 2.635838, 2.628243, 2.625198, 2.624073, 2.629076, 2.636847, 2.651136, 2.666528, 2.687162, 2.703298, 2.720997, 2.725048, 2.733126, 2.739676, 2.758795, 2.784468, 2.828839, 2.882109, 2.957323, 3.035628, 3.132749, 3.211382, 3.294971, 3.322417, 3.363944, 3.397152, 3.478248, 3.582545, 3.757047, 3.959682, 4.237050, 4.505387, 4.814126, 4.999092, 5.133058, 4.967982, 4.761574, 4.450719, 4.188805, 3.929133, 3.743415, 3.588044, 3.497240, 3.429079, 3.403430, 3.372253, 3.353863, 3.289795, 3.230115, 3.155418, 3.095806, 3.038407, 2.998293, 2.964985, 2.946281, 2.932598, 2.928675, 2.923520, 2.921387, 2.908542, 2.896552, 2.880707, 2.868335, 2.856305, 2.848558, 2.842395, 2.840090, 2.838849, 2.840290, 2.840730, 2.841913, 2.838840, 2.836364, 2.832705, 2.831274, 2.830558, 2.832921, 2.836449, 2.843223, 2.850192, 2.859652, 2.866180, 2.873187, 2.872274, 2.873370, 2.873361, 2.880054, 2.889971, 2.909768, 2.933820, 2.969326, 3.005633, 3.051638, 3.086380, 3.123489, 3.128371, 3.142066, 3.151940, 3.191646, 3.247455, 3.349061, 3.473123, 3.651486, 3.835035, 4.059037, 4.214029, 4.345404, 4.253320, 4.120310, 3.881933, 3.669551, 3.441331, 3.271007, 3.119726, 3.027304, 2.952780, 2.920226, 2.877914, 2.847370, 2.761025, 2.678222, 2.576020, 2.491873, 2.410348, 2.350749, 2.300065, 2.268311, 2.243244, 2.230909, 2.217135, 2.207449, 2.184174, 2.162529, 2.136423, 2.115465, 2.095513, 2.081639, 2.070261, 2.064199, 2.059841, 2.059122, 2.057465, 2.056929, 2.051460, 2.046844, 2.040942, 2.037746, 2.035500, 2.036864, 2.039732, 2.046335, 2.053458, 2.063477, 2.070783, 2.078827, 2.078954, 2.081223, 2.082456, 2.090593, 2.102190, 2.124021, 2.150549, 2.189072, 2.229049, 2.279404, 2.319247, 2.362060, 2.373192, 2.393293, 2.409780, 2.456250, 2.519249, 2.628587, 2.761299, 2.949307, 3.143818, 3.379874, 3.548057, 3.692895, 3.614152, 3.492886, 3.264559, 3.060247, 2.838484, 2.673169, 2.525847, 2.436523, 2.364530, 2.334035, 2.293514, 2.264475, 2.179506, 2.097782, 1.996448, 1.912873, 1.831721, 1.772235, 1.721519, 1.689514, 1.664143, 1.651343, 1.637233, 1.627163, 1.603906, 1.582152, 1.555981, 1.534581, 1.514004, 1.498960, 1.486186, 1.478110, 1.471721, 1.468469, 1.464928, 1.462408, 1.456675, 1.451326, 1.444903, 1.439653, 1.434608, 1.430920, 1.427787, 1.425804, 1.424235, 1.423433, 1.422561, 1.421939, 1.420534, 1.419221, 1.417644, 1.416348, 1.415096, 1.414162, 1.413346, 1.412778, 1.412259, 1.411834, 1.411236, 1.410417, 1.408919, 1.406560, 1.402584, 1.395918, 1.384400, 1.364358, 1.329162, 1.267185, 1.157802, 0.964619, 0.623269, 0.000000
  };

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