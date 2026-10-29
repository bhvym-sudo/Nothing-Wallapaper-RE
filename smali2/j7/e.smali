.class public final synthetic Lj7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lj7/j;


# direct methods
.method public synthetic constructor <init>(Lj7/j;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/e;->q:Lj7/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lj7/e;->q:Lj7/j;

    invoke-static {p0}, Lj7/j;->h(Lj7/j;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method
