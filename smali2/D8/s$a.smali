.class public final LD8/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/s;->m(LD8/h;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LD8/h;


# direct methods
.method public constructor <init>(LD8/h;)V
    .registers 2

    iput-object p1, p0, LD8/s$a;->q:LD8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 1

    iget-object p0, p0, LD8/s$a;->q:LD8/h;

    invoke-interface {p0}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method
