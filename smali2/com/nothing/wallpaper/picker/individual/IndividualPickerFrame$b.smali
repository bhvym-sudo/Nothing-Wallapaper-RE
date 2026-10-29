.class public final Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$b;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$b;->a:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame$b;->a:Lcom/nothing/wallpaper/picker/individual/IndividualPickerFrame;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p0

    goto :goto_e

    :cond_d
    const/4 p0, 0x0

    :goto_e
    const/4 v0, 0x1

    if-lez p0, :cond_16

    sub-int/2addr p0, v0

    if-ne p0, p1, :cond_16

    const/4 p0, 0x3

    return p0

    :cond_16
    return v0
.end method
