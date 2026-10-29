.class public final synthetic Lq7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lq7/l;


# direct methods
.method public synthetic constructor <init>(Lq7/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/j;->q:Lq7/l;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Lq7/j;->q:Lq7/l;

    check-cast p1, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;

    invoke-static {p0, p1}, Lq7/l;->B0(Lq7/l;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
