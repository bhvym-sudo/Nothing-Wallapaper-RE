.class public final synthetic Lh7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lh7/o;


# direct methods
.method public synthetic constructor <init>(Lh7/o;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/n;->q:Lh7/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lh7/n;->q:Lh7/o;

    invoke-static {p0}, Lh7/o;->b(Lh7/o;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
