.class public final synthetic LE7/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:LE7/Z;


# direct methods
.method public synthetic constructor <init>(LE7/Z;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/Y;->q:LE7/Z;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LE7/Y;->q:LE7/Z;

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Landroid/graphics/PointF;

    invoke-static {p0, p1, p2}, LE7/Z;->e(LE7/Z;Ljava/lang/Float;Landroid/graphics/PointF;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
