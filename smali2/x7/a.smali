.class public final synthetic Lx7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/A;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/a;->a:Ljava/util/List;

    iput-object p2, p0, Lx7/a;->b:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .registers 3

    iget-object v0, p0, Lx7/a;->a:Ljava/util/List;

    iget-object p0, p0, Lx7/a;->b:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->c(Ljava/util/List;Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;Ljava/util/List;)V

    return-void
.end method
