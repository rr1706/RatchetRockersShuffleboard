package frc.rr1706;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import frc.rr1706.widgets.UDPCameraViewerWidget;
import frc.rr1706.data.UDPCameraFeedType;

import java.util.List;
import java.util.Map;

@Description(
    group = "frc.rr1706", 
    name = "UDPCameraViewer", 
    version = "0.1.0", 
    summary = "A widget for viewing a camera/image feed from a udp connection"
)
public final class UDPCameraViewer extends Plugin {
    @Override
    public List<DataType> getDataTypes() {
        return List.of(
            UDPCameraFeedType.Instance
        );
    }

    @Override
    public List<ComponentType> getComponents() {
        return List.of(
            WidgetType.forAnnotatedWidget(UDPCameraViewerWidget.class)
        );
    }

    @Override
    public Map<DataType, ComponentType> getDefaultComponents() {
        return Map.of(
            UDPCameraFeedType.Instance, WidgetType.forAnnotatedWidget(UDPCameraViewerWidget.class)
        );
    }
}
