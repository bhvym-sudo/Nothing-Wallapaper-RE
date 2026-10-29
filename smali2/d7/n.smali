.class public final synthetic Ld7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lv8/a;


# direct methods
.method public synthetic constructor <init>(Lv8/a;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/n;->q:Lv8/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Ld7/n;->q:Lv8/a;

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/binder/NTSuggestedWallpaperSectionBinder;->b(Lv8/a;Landroid/view/View;)V

    return-void
.end method
