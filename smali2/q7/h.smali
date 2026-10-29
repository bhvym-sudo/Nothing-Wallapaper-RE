.class public final synthetic Lq7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lq7/l;


# direct methods
.method public synthetic constructor <init>(Lq7/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/h;->q:Lq7/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lq7/h;->q:Lq7/l;

    invoke-static {p0}, Lq7/l;->w0(Lq7/l;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
