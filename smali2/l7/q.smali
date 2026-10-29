.class public final synthetic Ll7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:Ll7/r;


# direct methods
.method public synthetic constructor <init>(Ll7/r;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/q;->q:Ll7/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, Ll7/q;->q:Ll7/r;

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p0, p1, p2}, Ll7/r;->p1(Ll7/r;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
