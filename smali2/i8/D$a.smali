.class public final Li8/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/D;->K(Ljava/lang/Iterable;)LD8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .registers 2

    iput-object p1, p0, Li8/D$a;->a:Ljava/lang/Iterable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .registers 1

    iget-object p0, p0, Li8/D$a;->a:Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method
