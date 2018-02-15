package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class LeftToRightSwitch extends AutoDirection {

  private double[] leftMotorSpeeds = {
    0.000000, 2.929030, 4.566548, 5.492888, 6.016863, 6.313192, 6.480697, 6.575315, 6.628655, 6.658656, 6.675404, 6.684702, 6.689695, 6.692245, 6.693287, 6.693447, 6.692945, 6.692053, 6.690751, 6.689284, 6.687519, 6.685804, 6.683733, 6.681441, 6.678506, 6.675086, 6.670726, 6.665773, 6.659700, 6.653281, 6.645824, 6.638686, 6.630159, 6.620766, 6.608759, 6.594782, 6.576958, 6.556711, 6.531885, 6.505693, 6.475307, 6.446429, 6.411962, 6.374101, 6.325568, 6.269075, 6.196824, 6.114936, 6.014575, 5.910011, 5.789916, 5.680649, 5.551924, 5.414430, 5.237819, 5.035846, 4.778384, 4.498283, 4.167095, 3.867287, 3.571848, 3.444351, 3.361814, 3.382679, 3.404986, 3.463556, 3.493067, 3.528890, 3.532249, 3.550226, 3.556148, 3.613637, 3.668338, 3.743929, 3.804572, 3.866056, 3.908874, 3.947085, 3.970259, 3.993430, 4.009747, 4.036650, 4.060611, 4.088272, 4.111384, 4.134102, 4.152495, 4.169554, 4.183778, 4.197302, 4.209955, 4.223179, 4.237477, 4.253143, 4.271662, 4.292083, 4.316956, 4.343177, 4.374481, 4.403887, 4.437330, 4.462990, 4.496352, 4.531765, 4.583258, 4.642419, 4.723044, 4.808794, 4.915364, 5.011122, 5.118537, 5.187157, 5.276234, 5.362466, 5.493568, 5.636907, 5.831877, 6.019358, 6.237027, 6.380523, 6.501747, 6.454235, 6.391292, 6.273548, 6.185950, 6.098186, 6.050097, 6.012591, 6.005768, 5.997982, 6.003000, 5.983830, 5.969331, 5.945908, 5.931455, 5.917036, 5.912494, 5.909939, 5.915252, 5.919465, 5.927295, 5.927485, 5.930104, 5.930578, 5.936274, 5.943156, 5.956740, 5.971544, 5.992744, 6.011310, 6.034039, 6.047174, 6.067683, 6.089106, 6.126287, 6.170440, 6.236006, 6.306879, 6.400042, 6.484672, 6.585978, 6.653722, 6.753029, 6.859773, 7.032238, 7.235028, 7.524545, 7.831668, 8.218945, 8.550983, 8.916243, 9.103162, 9.349409, 9.556745, 9.898751, 10.245990, 10.726296, 11.154840, 11.660701, 12.022326, 12.410568, 12.605891, 12.858610, 13.097025, 13.388940, 13.683253, 14.002350, 14.317375, 14.642309, 14.954546, 15.261237, 15.532766, 15.778353, 15.988485, 16.172461, 16.329267, 16.467386, 16.588017, 16.697518, 16.795365, 16.884752, 16.961284, 17.027209, 17.081181, 17.125755, 17.160943, 17.189066, 17.210116, 17.225896, 17.235553, 17.240486, 17.238653, 17.232310, 17.220065, 17.203176, 17.179553, 17.149818, 17.110835, 17.063454, 17.003373, 16.933301, 16.848121, 16.755797, 16.651642, 16.539152, 16.409650, 16.264499, 16.090896, 15.892394, 15.652073, 15.383034, 15.065370, 14.738375, 14.388281, 14.041007, 13.671834, 13.306111, 12.906662, 12.517686, 12.069245, 11.640545, 11.047369, 10.512121, 9.911506, 9.432399, 8.956507, 8.639492, 8.353139, 8.221326, 8.051319, 7.942516, 7.579288, 7.218017, 6.729337, 6.316684, 5.895437, 5.585290, 5.305463, 5.120630, 4.939779, 4.806303, 4.613817, 4.448812, 4.270066, 4.130458, 4.001604, 3.910574, 3.833027, 3.783208, 3.736532, 3.703115, 3.655558, 3.615399, 3.571789, 3.538330, 3.507252, 3.486077, 3.467468, 3.456128, 3.443508, 3.434111, 3.417209, 3.403516, 3.388212, 3.379270, 3.371480, 3.371226, 3.370725, 3.376852, 3.376254, 3.379407, 3.364958, 3.361605, 3.359645, 3.385074, 3.424377, 3.504079, 3.596053, 3.730687, 3.837089, 3.950257, 3.905984, 3.838890, 3.673169, 3.528274, 3.351599, 3.229198, 3.106810, 3.041199, 2.957047, 2.896453, 2.750296, 2.612135, 2.438517, 2.295742, 2.153846, 2.050922, 1.958937, 1.899221, 1.840254, 1.797166, 1.732135, 1.676635, 1.615736, 1.569896, 1.528352, 1.502644, 1.482435, 1.474886, 1.467776, 1.467578, 1.458889, 1.456608, 1.454223, 1.463021, 1.476518, 1.503635, 1.534768, 1.578717, 1.619079, 1.667721, 1.699540, 1.744607, 1.791029, 1.864291, 1.947924, 2.065080, 2.185866, 2.335307, 2.459210, 2.593474, 2.657377, 2.744046, 2.816059, 2.941622, 3.069099, 3.249647, 3.399615, 3.568402, 3.630935, 3.661192, 3.511964, 3.362527, 3.176805, 3.037374, 2.911979, 2.833574, 2.772547, 2.743974, 2.718704, 2.707282, 2.678406, 2.655495, 2.627181, 2.607249, 2.588395, 2.577668, 2.569139, 2.566579, 2.564051, 2.564088, 2.559936, 2.556653, 2.551689, 2.548244, 2.544713, 2.542831, 2.541282, 2.541018, 2.540679, 2.540893, 2.540071, 2.539417, 2.538326, 2.537571, 2.536772, 2.536354, 2.536004, 2.535954, 2.535878, 2.535927, 2.535712, 2.535519, 2.535187, 2.534881, 2.534471, 2.533988, 2.533233, 2.532042, 2.529949, 2.526302, 2.519796, 2.508349, 2.488130, 2.452468, 2.389480, 2.278218, 2.081603, 1.734127, 1.119978, 0.000000
  };

  private double[] rightMotorSpeeds = {
    0.000000, 2.929206, 4.566910, 5.493452, 6.017665, 6.314254, 6.482079, 6.577032, 6.630775, 6.661151, 6.678330, 6.687957, 6.693387, 6.696405, 6.698145, 6.699115, 6.699738, 6.700062, 6.700304, 6.700281, 6.700212, 6.699744, 6.699383, 6.698927, 6.698781, 6.698625, 6.698832, 6.698831, 6.699081, 6.698573, 6.698074, 6.696051, 6.694541, 6.692699, 6.692189, 6.691695, 6.692772, 6.693088, 6.694557, 6.693036, 6.691710, 6.684220, 6.679076, 6.672886, 6.672718, 6.673354, 6.681512, 6.687792, 6.700454, 6.702172, 6.706363, 6.685171, 6.675529, 6.663844, 6.681411, 6.707832, 6.772091, 6.834046, 6.924820, 6.958748, 6.977126, 6.821952, 6.645791, 6.393003, 6.174106, 5.948131, 5.779026, 5.623698, 5.518051, 5.409304, 5.323440, 5.194192, 5.078478, 4.950951, 4.847646, 4.750672, 4.678741, 4.615952, 4.571978, 4.530526, 4.498197, 4.456959, 4.420785, 4.382709, 4.351053, 4.321283, 4.297210, 4.275511, 4.257557, 4.240990, 4.225926, 4.210828, 4.195259, 4.178916, 4.160358, 4.140572, 4.117051, 4.092991, 4.064695, 4.039284, 4.010802, 3.991220, 3.964894, 3.937781, 3.896020, 3.848670, 3.782387, 3.714513, 3.629895, 3.561405, 3.486692, 3.457324, 3.412931, 3.378532, 3.307123, 3.234994, 3.124944, 3.041298, 2.947956, 2.953779, 3.002139, 3.237897, 3.488220, 3.788176, 4.042396, 4.282818, 4.467190, 4.629378, 4.749784, 4.864602, 4.959217, 5.072584, 5.170890, 5.268680, 5.346411, 5.415124, 5.465308, 5.507146, 5.535500, 5.561087, 5.579368, 5.602413, 5.619231, 5.634741, 5.641271, 5.643269, 5.635270, 5.623076, 5.601674, 5.580250, 5.552258, 5.531484, 5.501329, 5.467980, 5.416550, 5.355177, 5.269282, 5.174223, 5.053315, 4.936996, 4.801533, 4.697619, 4.563145, 4.422771, 4.220363, 3.992529, 3.686686, 3.376392, 3.007158, 2.724008, 2.450324, 2.409577, 2.372275, 2.451127, 2.484549, 2.629658, 2.780205, 3.161342, 3.658335, 4.523692, 5.539912, 6.902426, 8.187497, 9.427525, 10.470555, 11.383741, 12.129683, 12.777879, 13.321326, 13.819567, 14.261015, 14.691606, 15.067097, 15.405621, 15.687305, 15.929796, 16.127998, 16.298172, 16.439836, 16.566666, 16.676793, 16.780804, 16.869485, 16.947277, 17.009687, 17.060757, 17.099038, 17.128142, 17.147634, 17.160663, 17.166669, 17.168462, 17.163788, 17.153261, 17.134778, 17.108122, 17.071294, 17.023806, 16.963919, 16.891849, 16.806803, 16.710760, 16.602704, 16.481050, 16.340906, 16.177626, 15.983793, 15.754429, 15.482262, 15.167031, 14.805761, 14.408939, 13.971920, 13.490767, 12.942539, 12.311913, 11.563095, 10.686537, 9.647073, 8.489011, 7.212323, 6.032872, 4.917129, 4.015940, 3.212246, 2.597093, 2.020951, 1.575756, 1.140673, 0.897581, 0.794317, 0.654681, 0.654746, 0.708145, 0.833567, 1.062932, 1.247046, 1.443405, 1.573871, 1.719564, 1.831551, 2.012024, 2.171760, 2.349653, 2.490889, 2.622628, 2.716787, 2.797231, 2.849310, 2.897469, 2.931440, 2.978519, 3.017015, 3.057539, 3.086257, 3.110547, 3.122637, 3.129333, 3.125788, 3.119975, 3.107659, 3.099126, 3.084634, 3.068113, 3.041382, 3.007768, 2.960036, 2.903465, 2.830682, 2.752644, 2.660369, 2.573950, 2.469695, 2.354948, 2.204366, 2.026196, 1.793086, 1.527678, 1.202687, 0.888503, 0.566456, 0.404240, 0.314857, 0.233385, 0.202381, 0.177897, 0.155703, 0.163294, 0.158503, 0.167114, 0.204696, 0.199092, 0.231520, 0.323575, 0.406511, 0.502833, 0.570667, 0.634455, 0.671136, 0.710391, 0.736534, 0.786599, 0.829471, 0.879684, 0.916817, 0.951218, 0.971215, 0.986802, 0.990682, 0.994853, 0.992790, 0.999802, 1.001051, 1.003040, 0.994525, 0.982041, 0.956717, 0.928278, 0.887982, 0.852419, 0.809737, 0.785282, 0.748931, 0.713149, 0.653063, 0.586629, 0.492565, 0.404309, 0.301810, 0.248193, 0.221533, 0.185641, 0.184124, 0.193947, 0.233672, 0.284132, 0.390865, 0.467707, 0.569724, 0.582320, 0.609787, 0.552351, 0.645645, 0.856656, 1.057295, 1.259897, 1.417990, 1.558156, 1.662094, 1.760239, 1.840378, 1.934643, 2.015886, 2.096059, 2.160238, 2.217236, 2.260285, 2.296964, 2.324051, 2.348749, 2.368631, 2.391061, 2.410273, 2.429148, 2.444314, 2.457842, 2.468121, 2.476923, 2.483459, 2.489427, 2.494239, 2.499649, 2.504286, 2.508845, 2.512514, 2.515793, 2.518288, 2.520427, 2.522016, 2.523464, 2.524625, 2.525922, 2.527014, 2.528058, 2.528835, 2.529426, 2.529665, 2.529531, 2.528758, 2.527053, 2.523698, 2.517576, 2.506463, 2.486602, 2.451239, 2.388535, 2.277505, 2.081101, 1.733804, 1.119823, 0.000000
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